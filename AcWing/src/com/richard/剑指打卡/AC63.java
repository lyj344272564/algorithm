package com.richard.剑指打卡;

import java.util.HashMap;

/**
 * 63. 字符串中第一个只出现一次的字符
 */
public class AC63 {

    public char firstNotRepeatingChar(String s) {

        HashMap<Character,Boolean> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c,false);
            } else {
                map.put(c,true);
            }
        }

        for (char c : s.toCharArray()) {
            if (map.get(c)) {
                return c;
            }
        }

        return '#';

    }

}
