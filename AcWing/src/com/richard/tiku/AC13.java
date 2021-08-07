package com.richard.tiku;

import java.util.Arrays;

/**
 * 13. 找出数组中重复的数字
 */
public class AC13 {
    public static void main(String[] args) {

    }
    public int duplicateInArray(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        for (int i=0; i<n-1; i++) {
            if (nums[i]>(n-1) || nums[i]<0) {
                return -1;
            }
            if (nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return -1;

    }
}
