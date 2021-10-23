package com.richard.AcWingLC;

public class LC122 {

    public int maxProfit(int[] prices) {

        int res = 0;

        for (int i=0; i+1<prices.length; i++) {

            res += Math.max(0,prices[i+1]-prices[i]);

        }

        return res;

    }

}
