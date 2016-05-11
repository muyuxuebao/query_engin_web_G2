package com.query_engin.bean;

import com.query_engin.thrift.thriftImpl.Token;
import com.query_engin.thrift.thriftImpl.User;
import com.query_engin.thrift.thriftImpl.Word;

/**
 * Created by yinliang on 2016/5/9.
 */
public class TokenItemInfo {
    Word word;
    User user;
    int length;
    int postion;

    public TokenItemInfo() {
    }

    public TokenItemInfo(User user, Word word, int postion, int length) {
        this.word = word;
        this.user = user;
        this.length = length;
        this.postion = postion;
    }

    public Word getWord() {

        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }
}
