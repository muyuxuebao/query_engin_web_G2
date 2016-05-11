package com.query_engin.bean;

import java.util.Comparator;

/**
 * Created by yinliang on 2016/5/9.
 */
public class Pair implements Comparable<Pair> {
    public long l1;
    public long l2;

    public Pair(long l1, long l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public int compareTo(Pair o) {
        if (this.l1 > o.l1) {
            return -1;
        } else if (this.l1 == o.l1) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (l1 != pair.l1) return false;
        return l2 == pair.l2;

    }

    @Override
    public int hashCode() {
        int result = (int) (l1 ^ (l1 >>> 32));
        result = 31 * result + (int) (l2 ^ (l2 >>> 32));
        return result;
    }
}
