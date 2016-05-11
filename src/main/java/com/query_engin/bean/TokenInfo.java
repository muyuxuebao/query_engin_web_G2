package com.query_engin.bean;

import java.util.List;

/**
 * Created by yinliang on 2016/5/9.
 */
public class TokenInfo {
    String name;
    List<TokenItemInfo> tokenItemInfos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TokenItemInfo> getTokenItemInfos() {
        return tokenItemInfos;
    }

    public void setTokenItemInfos(List<TokenItemInfo> tokenItemInfos) {
        this.tokenItemInfos = tokenItemInfos;
    }

    public TokenInfo() {

    }

    public TokenInfo(String name, List<TokenItemInfo> tokenItemInfos) {

        this.name = name;
        this.tokenItemInfos = tokenItemInfos;
    }
}
