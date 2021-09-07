package com.richard.lc;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * 1221. 分割平衡字符串
 */
public class LC1221 {

    public int balancedStringSplit(String s) {

        int n = s.length();

        int res = 0;
        int d = 0;
        for(int i=0; i<n; i++) {
            if (s.charAt(i) == 'L') {
                ++d;
            } else {
                --d;
            }
            if (d == 0) {
                ++res;
            }
        }
        return res;
    }

}
