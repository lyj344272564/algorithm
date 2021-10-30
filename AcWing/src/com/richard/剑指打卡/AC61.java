package com.richard.剑指打卡;

import java.util.HashMap;

public class AC61 {
    public int longestSubstringWithoutDuplication(String s) {
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int start=0,end=0; end<s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start,map.get(c));
            }
            len = Math.max(len,end-start+1);
            map.put(c,end+1);
        }
        return len;
    }
}
