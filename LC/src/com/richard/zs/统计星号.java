package com.richard.zs;

/**
 * @Author: Richard
 * @Date: 2022-06-26 9:49
 */
public class 统计星号 {
    public int countAsterisks(String s) {
        int res = 0;
        int cnt = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '|') {
                cnt++;
            }
            if (cnt%2 == 0) {
                if (s.charAt(i) == '*') {
                    res++;
                }
            }
        }
        return res;
    }
}
