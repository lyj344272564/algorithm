package com.richard.zs;

import java.util.*;

/**
 * @Author: Richard
 * @Date: 2022-06-19 11:10
 */
public class 兼具大小写的最好英文字母 {
    public String greatestLetter(String s) {
        List<Character> list = new ArrayList<>();
        List<Character> res = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (list.contains((char)(c-32)) || list.contains((char)(c+32))) {
                res.add(Character.toUpperCase(c));
            }
            list.add(c);
        }

        if (res.size() == 0) {
            return "";
        } else {
            char ans = res.get(0);
            for (int i=1; i<res.size(); i++) {
                if (ans < res.get(i)) {
                    ans = res.get(i);
                }
            }
            return ""+ans;
        }
    }
}
