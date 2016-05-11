package com.query_engin.controller;

import com.query_engin.bean.QueryResult;
import com.query_engin.bean.TokenInfo;
import com.query_engin.bean.TokenItemInfo;
import com.query_engin.thrift.ThriftProxy;
import com.query_engin.thrift.thriftImpl.Token;
import com.query_engin.thrift.thriftImpl.TokenItem;
import com.query_engin.thrift.thriftImpl.User;
import com.query_engin.thrift.thriftImpl.Word;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
public class MainController {
    @Autowired
    ThriftProxy thriftProxy;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addUser(@RequestParam("a_user_name") String a_user_name) {
        System.out.println("a_user_name  = " + a_user_name);

        Map<String, Object> map = new HashMap<String, Object>();
        User user = new User();
        user.setName(a_user_name);
        try {
            long id = thriftProxy.addUser(user);
            System.out.println("The id of user is " + id);
            map.put("result", true);
        } catch (TException e) {
            map.put("result", false);
            map.put("error_msg", e.getMessage());
        }
        return map;
    }

    @RequestMapping(value = "/addWord", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addWord(@RequestParam("a_word_name") String a_word_name) {
        System.out.println("a_word_name  = " + a_word_name);

        Map<String, Object> map = new HashMap<String, Object>();
        Word word = new Word();
        word.setName(a_word_name);
        try {
            long id = thriftProxy.addWord(word);
            System.out.println("The id of word is " + id);
            map.put("result", true);
        } catch (TException e) {
            map.put("result", false);
        }
        return map;
    }

    @RequestMapping(value = "/userbuyword", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> userbuyword(@RequestParam("userId") long userId, @RequestParam("wordId") long wordId) {
        System.out.println("userId = " + userId + " ,wordId = " + wordId);
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            User user = this.thriftProxy.getUser(userId);
            Word word = this.thriftProxy.getWord(wordId);
            this.thriftProxy.userBuyWord(user, word);
            map.put("result", true);
        } catch (TException e) {
            map.put("result", false);
        }
        return map;
    }

    @RequestMapping(value = "/userquery", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> userquery(@RequestParam("searchstr") String searchstr) {
        System.out.println("userquery " + searchstr);

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<QueryResult> queryResults = thriftProxy.produceSearch(searchstr);
            map.put("queryResults", queryResults);
        } catch (TException e) {
            e.printStackTrace();
        }

        return map;
    }


    @RequestMapping(value = "/initUserBuyWordPage", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> initUserBuyWordPage(@RequestParam("pin") String pin, @RequestParam("money") BigDecimal money) {
        System.out.println("initUserAndWord pin:" + pin + " money:" + money);

        Map<String, Object> map = new HashMap<String, Object>();

        try {
            map.put("userList", thriftProxy.getAllUser());
            map.put("wordList", thriftProxy.getAllWord());
        } catch (TException e) {
            e.printStackTrace();
        }

        return map;
    }

    @RequestMapping(value = "/initTokenInfo", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> initTokenInfo(@RequestParam("pin") String pin, @RequestParam("money") BigDecimal money) {
        System.out.println("initUserAndWord pin:" + pin + " money:" + money);

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<Token> tokens = thriftProxy.getAllToken();
            List<TokenInfo> tokenInfos = new ArrayList<TokenInfo>();


            for (Token token : tokens) {
                TokenInfo tokenInfo = new TokenInfo();
                tokenInfo.setName(token.getName());

                List<TokenItem> tokenItems = token.getTokenItemVetor();
                List<TokenItemInfo> tokenItemInfos = new ArrayList<TokenItemInfo>();
                for (TokenItem tokenItem : tokenItems) {
                    User user = thriftProxy.getUser(tokenItem.getUserId());
                    Word word = thriftProxy.getWord(tokenItem.getWordId());
                    int postion = tokenItem.getPostion();
                    int length = tokenItem.getLength();

                    TokenItemInfo tokenItemInfo = new TokenItemInfo(user, word, postion, length);
                    tokenItemInfos.add(tokenItemInfo);
                }

                tokenInfo.setTokenItemInfos(tokenItemInfos);
                tokenInfos.add(tokenInfo);
            }

            map.put("tokenInfos", tokenInfos);
        } catch (TException e) {
            e.printStackTrace();
        }


        return map;
    }
}