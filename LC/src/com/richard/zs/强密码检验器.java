package com.richard.zs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class 强密码检验器 {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if (n < 8) return false;
        int xx = 0;
        int dx = 0;
        int sz = 0;
        int tszf = 0;

        List<Character> list = new ArrayList<>();
        for (char c : "!@#$%^&*()-+".toCharArray()) {
            list.add(c);
        }
        for (int i=0; i<n; i++) {
            char c = password.charAt(i);
            if (i+1<n) {
                if (c == password.charAt(i+1)) return false;
            }
            if (Character.isDigit(c)) {
                sz++;
            }
            if (Character.isLowerCase(c)) {
                xx++;
            }
            if (Character.isUpperCase(c)) {
                dx++;
            }
            if (list.contains(c)) {
                tszf++;
            }
        }
        return sz>=1 && xx>=1 && dx>=1 && tszf>=1;
    }
}
