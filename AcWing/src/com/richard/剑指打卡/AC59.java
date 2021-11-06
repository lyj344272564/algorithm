package com.richard.剑指打卡;

public class AC59 {

    public int getTranslationCount(String s) {
        if(s == null || s.length() < 1) {
            return 0;
        }


        if(s.length() < 2) {
            return 1;
        }

        int[] dp = new int[s.length()];
        dp[0] = 1;
        dp[1] = (s.charAt(0) == '1' || (s.charAt(0) == '2' && s.charAt(1) >= '0' && s.charAt(1) <= '5')) ? 2 : 1;

        for(int i = 2; i < s.length(); i++) {
            if(s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) >= '0' && s.charAt(i) <= '5')) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[s.length() - 1];

    }
}
