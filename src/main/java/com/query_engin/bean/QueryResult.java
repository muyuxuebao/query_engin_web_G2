package com.query_engin.bean;

import com.query_engin.thrift.thriftImpl.User;
import com.query_engin.thrift.thriftImpl.Word;

/**
 * Created by yinliang on 2016/5/9.
 */
public class QueryResult {
    User user;
    Word word;

    public QueryResult() {
    }

    public QueryResult(User user, Word word) {

        this.user = user;
        this.word = word;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }
}
