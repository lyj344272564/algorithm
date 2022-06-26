package com.richard.lc;

import java.util.HashMap;
import java.util.Map;

public class 最小覆盖子串 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> hs = new HashMap<>();
        Map<Character, Integer> ht = new HashMap<>();
        for (char c : t.toCharArray()) {
            ht.put(c, ht.getOrDefault(c, 0)+1);
        }
        String res = "";
        int cnt = 0;
        for (int i=0,j=0; i<s.length(); i++) {
            char c = s.charAt(i);
            hs.put(c, hs.getOrDefault(c, 0) + 1);
            if (ht.containsKey(c)  && hs.get(c) <= ht.get(c)) cnt++;
            while (j <= i && (!ht.containsKey(s.charAt(j)) || hs.get(s.charAt(j)) > ht.get(s.charAt(j)))){
                hs.put(s.charAt(j), hs.get(s.charAt(j ++)) - 1);
            }
            if (cnt == t.length()) {
                if (res.isEmpty() || i-j+1 < res.length()) {
                    res = s.substring(j, i-j+1);
                }
            }
        }
        return res;
    }
}
