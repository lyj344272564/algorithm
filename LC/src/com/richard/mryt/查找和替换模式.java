package com.richard.mryt;

import java.util.*;

public class 查找和替换模式 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }
    public boolean check(String a, String b) {
        Map<Character, Character> f = new HashMap<>();
        Map<Character, Character> g = new HashMap<>();
        for (int i=0; i<a.length(); i++) {
            // 映射不唯一
            if (f.containsKey(a.charAt(i)) && f.get(a.charAt(i))!=b.charAt(i)) return false;
            if (g.containsKey(b.charAt(i)) && g.get(b.charAt(i))!=a.charAt(i)) return false;
            f.put(a.charAt(i), b.charAt(i));
            g.put(b.charAt(i), a.charAt(i));
        }
        return true;
    }
}
