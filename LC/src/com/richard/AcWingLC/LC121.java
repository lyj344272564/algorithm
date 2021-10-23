package com.richard.AcWingLC;

public class LC121 {

    public int maxProfit(int[] prices) {

        int res = 0;

        for (int i=0,min=Integer.MAX_VALUE; i<prices.length; i++) {

            res = Math.max(res, prices[i]-min);
            // 记录一个最小值
            min = Math.min(prices[i],min);

        }

        return res;

    }

}
