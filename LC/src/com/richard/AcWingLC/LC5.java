package com.richard.AcWingLC;

/**
 * 5. 最长回文子串
 */
public class LC5 {

    public String longestPalindrome(String s) {

        String res = "";

        for (int i=0; i<s.length(); i++) {
            int l = i - 1;
            int r = i + 1;

            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                l--;
                r++;
            }

            if (res.length() < r-l-1) {
                res = s.substring(l+1,r);
            }
            l = i;
            r = i + 1;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                l--;
                r++;
            }

            if (res.length() < r-l-1) {
                res = s.substring(l+1,r);
            }

        }

        return res;
    }

}
