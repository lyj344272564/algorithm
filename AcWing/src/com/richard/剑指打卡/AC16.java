package com.richard.剑指打卡;

/**
 * 16. 替换空格
 */
public class AC16 {
    public String replaceSpaces(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        int n =str.length();

        for (int i=0; i<n; i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
