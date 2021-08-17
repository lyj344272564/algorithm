package com.richard.AcWingLC;

/**
 * 6. Z 字形变换
 */
public class LC6 {

    public String convert(String s, int n) {

        String res = "";
        if(n == 1) {
            return s;
        }
        for (int i=0; i<n; i++) {
            if (i==0 || i==n-1) {
                for (int j=i; j<s.length(); j+=2*n-2) {
                    res += s.charAt(j);
                }
            } else {
                for (int j=i,k=2*n-2-i; j<s.length()||k<s.length();j+=2*n-2,k+=2*n-2) {
                    if (j<s.length()) {
                        res += s.charAt(j);
                    }
                    if (k<s.length()) {
                        res += s.charAt(k);
                    }
                }
            }
        }

        return res;


    }

}
