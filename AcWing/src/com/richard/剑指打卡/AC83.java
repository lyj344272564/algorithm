package com.richard.剑指打卡;

public class AC83 {
    public int maxDiff(int[] nums) {
        int res = 0;
        for (int i=0,min=Integer.MAX_VALUE; i<nums.length; i++) {
            res = Math.max(res, nums[i]-min);
            min = Math.min(min,nums[i]);
        }
        return res;
    }
}
