package com.richard.jianzhi;

/**
 * 剑指 Offer 05. 替换空格
 */
public class offer05 {

    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

}
