package com.richard.lc;

/**
 * 1480. 一维数组的动态和
 */
public class LC1480 {

    public int[] runningSum(int[] nums) {


        int n = nums.length;

        int[] res = new int[n];

        int count = nums[0];

        res[0] = nums[0];
        for (int i=1; i<n; i++) {

            count  += nums[i];
            res[i] = count;
        }

        return res;
    }
}
