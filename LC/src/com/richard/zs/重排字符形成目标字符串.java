package com.richard.zs;

import java.util.HashMap;
import java.util.Map;

public class 重排字符形成目标字符串 {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> map = new HashMap<>();
        // 拼成一个所需要的字符
        for (int i=0; i<target.length(); i++) {
            char c = target.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        Map<Character, Integer> smap = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            smap.put(c, smap.getOrDefault(c,0)+1);
        }
        int res = Integer.MAX_VALUE;
        for (Character c : map.keySet()) {
            if (smap.containsKey(c)) {
                int cnt = smap.get(c);
                int cnt2 = map.get(c);
                int c_min = cnt/cnt2;
                res = Math.min(res, c_min);
            } else {
                return 0;
            }
        }
        return res;
    }
}
