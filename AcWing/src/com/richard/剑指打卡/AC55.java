package com.richard.剑指打卡;

/**
 * 55. 连续子数组的最大和
 */
public class AC55 {

    public int maxSubArray(int[] nums) {
        int s = 0 ;
        int res = Integer.MIN_VALUE;
        for (int x : nums) {
            // 如果和为负数则置0
            if (s < 0) {
                s = 0;
            }
            // 每次s加完x之后都要与上次的最大值比较
            s += x;
            // res 存储的是上一次的  最大值
            res = Math.max(res, s);
        }

        return res;
    }

}
