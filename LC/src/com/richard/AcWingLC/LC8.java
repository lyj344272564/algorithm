package com.richard.AcWingLC;

/**
 * 8. 字符串转换整数 (atoi)
 */
public class LC8 {

    public int myAtoi(String s) {

        int k = 0;
        while (k<s.length() && s.charAt(k) == ' ') {
            k++;
        }

        if (k == s.length()) {
            return 0;
        }

        int minus = 1;
        if (s.charAt(k) == '-') {
            minus = -1;
            k++;
        } else if (s.charAt(k) == '+') {
            k++;
        }

        long res = 0;
        while (k < s.length() && s.charAt(k)>='0' && s.charAt(k)<='9') {
            res = res*10 + s.charAt(k) - '0';
            k++;
            if (res > Integer.MAX_VALUE) {
                break;
            }
        }

        res *= minus;

        if (res > Integer.MAX_VALUE) {
            res = Integer.MAX_VALUE;
        }
        if (res < Integer.MIN_VALUE){
            res = Integer.MIN_VALUE;
        }

        return (int)res;
    }

}
