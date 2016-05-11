package com.query_engin.thrift;

import com.query_engin.bean.Pair;
import com.query_engin.bean.QueryResult;
import com.query_engin.thrift.thriftImpl.*;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * Created by yinliang on 2016/4/25.
 */
public class ThriftProxy {
    @Autowired
    RedisProxyService.Client client;


    public long addUser(User user) throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.ADD_USER);
        request.setAdd_user_user(user);

        Response response = client.process(request);

        return response.add_user_user_id;
    }

    public User getUser(long id) throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.GET_USER);
        request.setGet_user_user_id(id);

        Response response = client.process(request);

        return response.get_user_user;
    }

    public long addWord(Word word) throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.ADD_WORD);
        request.setAdd_word_word(word);

        Response response = client.process(request);

        return response.add_word_word_id;
    }

    public List<User> getAllUser() throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.GET_ALL_USER);

        Response response = client.process(request);

        return response.get_all_user_user_list;

    }

    public List<Word> getAllWord() throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.GET_ALL_WORD);


        Response response = client.process(request);

        return response.get_all_word_word_list;
    }

    public Word getWord(long id) throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.GET_WORD);
        request.setGet_word_word_id(id);

        Response response = client.process(request);


        return response.get_word_word;
    }

    public void addToken(Token token) throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.ADD_TOKEN);
        request.setAdd_token_token(token);

        Response response = client.process(request);
    }

    public Token getToken(String name) throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.ADD_USER.GET_TOKEN);

        request.setGet_token_token_name(name);

        Response response = client.process(request);

        return response.get_token_token;


    }


    public void userBuyWord(User user, Word word) throws TException {
        String wordName = word.getName();
        for (int i = 0; i < wordName.length() && i + 1 < wordName.length(); i++) {
            String tokenName = wordName.substring(i, i + 2);
            System.out.println(tokenName);
            Token token = this.getToken(tokenName);
            if (token == null || token.getTokenItemVetor() == null || token.getTokenItemVetor().size() == 0) {
                token = new Token();
                token.setName(tokenName);
                token.setTokenItemVetor(new ArrayList<TokenItem>());
            }

            TokenItem tokenItem = new TokenItem(user.getId(), word.getId(), i, wordName.length());
            token.getTokenItemVetor().add(tokenItem);

            this.addToken(token);
        }
    }

    public List<Token> getAllToken() throws TException {
        Request request = new Request();
        request.setQuerytype(QueryType.GET_ALL_TOKEN);

        Response response = client.process(request);


        return response.get_all_token_token_list;
    }

    public List<QueryResult> produceSearch(String searchWord) throws TException {
        List<QueryResult> queryResults = new ArrayList<QueryResult>();

        List<TokenItem> tokenItems = getTokenItems(searchWord);
        Map<Pair, Queue<Pair>> map = getPairQueueMap(tokenItems);

        Set<Pair> set = map.keySet();
        for (Pair pair : set) {

            Queue<Pair> pairQueue = map.get(pair);

            if (pairQueue.isEmpty() == false) {
                long start = pairQueue.peek().l1;
                long end = start + 2;
                boolean beAdd = true;
                boolean first_e = true;

                while (pairQueue.isEmpty() == false) {
                    pairQueue.poll();
                    if (end != start + 2) {
                        beAdd = false;
                        break;
                    } else {
                        if (searchWord.length() % 2 == 1 && first_e == true) {
                            first_e = false;
                            end = start + 1;
                        } else {
                            end = start;
                        }
                        if (pairQueue.isEmpty() == false) {
                            start = pairQueue.peek().l1;
                        }
                    }
                }

                Word word = this.getWord(pair.l2);

                if (beAdd == true) {
                    User user = this.getUser(pair.l1);
                    QueryResult queryResult = new QueryResult(user, word);
                    queryResults.add(queryResult);
                }

            }

        }

        System.out.println("queryResults =" + queryResults);

        return queryResults;
    }

    private Map<Pair, Queue<Pair>> getPairQueueMap(List<TokenItem> tokenItems) {
        Map<Pair, Queue<Pair>> map = new HashMap<Pair, Queue<Pair>>();

        for (TokenItem tokenItem : tokenItems) {
            Pair key = new Pair(tokenItem.getUserId(), tokenItem.getWordId());
            Queue<Pair> queue = map.get(key);
            if (queue == null) {
                queue = new PriorityQueue<Pair>();
            }

            queue.add(new Pair(tokenItem.getPostion(), tokenItem.getLength()));
            map.put(key, queue);
        }
        return map;
    }

    private List<TokenItem> getTokenItems(String sesarchWord) throws TException {
        List<TokenItem> tokenItems = new ArrayList<TokenItem>();
        for (int i = 0; i < sesarchWord.length() && i + 1 < sesarchWord.length(); i += 2) {
            String tokenName = sesarchWord.substring(i, i + 2);
            List<TokenItem> tis = this.getToken(tokenName).getTokenItemVetor();

            for (TokenItem ti : tis) {
                tokenItems.add(ti);
            }
        }

        if (sesarchWord.length() % 2 == 1 && sesarchWord.length() > 2) {
            int index = sesarchWord.length() - 2;

            String tokenName = sesarchWord.substring(index, index + 2);
            List<TokenItem> tis = this.getToken(tokenName).getTokenItemVetor();

            for (TokenItem ti : tis) {
                tokenItems.add(ti);
            }
        }
        return tokenItems;
    }
}
