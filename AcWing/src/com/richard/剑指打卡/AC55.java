package com.richard.剑指打卡;

/**
 * 55. 连续子数组的最大和
 */
public class AC55 {

    public int maxSubArray(int[] nums) {

        // 以前一个数为结尾的  和最大为多少
        int s = 0;
        int res = Integer.MIN_VALUE;

        for (int x : nums) {
            // 不能将负收益加起来
            if (s < 0) {
                s = 0;
            }
            // 这次加之后的值 和上一次的最大值比较 如果比原来的小了然后放弃这次加
            s += x;
            res = Math.max(res, s);
        }

        return res;

    }

}
