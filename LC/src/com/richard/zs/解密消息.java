package com.richard.zs;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Richard
 * @Date: 2022-07-04 8:48
 */
public class 解密消息 {
    public static String decodeMessage(String key, String message) {
        StringBuilder res = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        char zm = 'a';
        for (int i=0; i<key.length(); i++) {
            if (key.charAt(i)==' ') {
                continue;
            }
            if (map.containsKey(key.charAt(i))) {
                continue;
            } else {
                map.put(key.charAt(i), (char) zm++);
            }
        }
        for (int i=0; i<message.length(); i++) {
            if (message.charAt(i) == ' ') {
                res.append(' ');
            } else {
                res.append(map.get(message.charAt(i)));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String res = decodeMessage(key, message);
        System.out.println(res);
    }
}
