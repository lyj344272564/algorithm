package com.richard.zs;

public class 极大极小游戏 {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] newNums = new int[n/2];
        while (n != 1) {
            for (int i=0; i<n/2; i++) {
                if (i%2 == 0) {
                    newNums[i] = Math.min(nums[2*i], nums[2*i+1]);
                } else {
                    newNums[i] = Math.max(nums[2*i], nums[2*i+1]);
                }
            }
            nums = newNums;
            newNums = new int[nums.length/2];
            n = n/2;
        }
        return nums[0];
    }
}
