package com.richard.剑指打卡;

/**
 * 13. 找出数组中重复的数字
 */
public class AC13 {

    public int duplicateInArray(int[] nums) {

        int n = nums.length;

        for (int i=0; i<n; i++) {
            if (nums[i]<0 || nums[i] > n-1) {
                return -1;
            }
        }

        for (int i=0; i<n; i++) {
                // 把nums[i] 放到正确的位置上
                while (i != nums[i]) {
                    if (nums[i] != nums[nums[i]]) {
                        swap(nums,i,nums[i]);
                    } else {
                        return nums[i];
                    }
                }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
