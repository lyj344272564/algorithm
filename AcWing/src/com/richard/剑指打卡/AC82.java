package com.richard.剑指打卡;

public class AC82 {

    public int lastRemaining(int n, int m) {

        if (1 == n) {
            return 0;
        }
        return (lastRemaining(n-1, m) + m) % n;
    }
}
