package com.richard.AcWingLC;

import java.util.HashMap;
import java.util.Map;


/**
 * 3. 无重复字符的最长子串
 */
public class LC3 {
    // 滑动窗口 + 标记数组
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();

        int res = 0;
        for (int i=0,j=0; i<s.length(); i++) {
           char c = s.charAt(i);
            // 如果字符c之前出现过, 则左边界为出现位置的下一个位置与当前左边界的最大值
           if (map.containsKey(c)) {
               j = Math.max(j,map.get(c)+1);
           }
           map.put(c,i);
           res = Math.max(res,i-j+1);
        }
        return res;
    }

    //双指针
    public int lengthOfLongestSubstring2(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        for (int i=0,j=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1) {
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;
    }
}
