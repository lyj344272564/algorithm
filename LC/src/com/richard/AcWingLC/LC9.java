package com.richard.AcWingLC;


/**
 * 9. 回文数
 */
public class LC9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int res = 0;
        int y = x;
        while (x!=0) {
            res = res*10 + x%10;
            x /= 10;
        }

        return res==y;
    }

}
