package com.richard.AcWingLC;

public class LC53 {

     // dp
    public int maxSubArray(int[] nums) {

        int res = Integer.MIN_VALUE;

        for (int i=0,last=0; i<nums.length; i++) {
            last = nums[i] + Math.max(last,0);
            res = Math.max(last,res);
        }

        return res;

    }

}
