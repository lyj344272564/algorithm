package com.richard.ms;

public class LC153 {

    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        // 说明这个数组是升序
        if (nums[r] >= nums[l]) {
            return nums[0];
        }

        while (l < r) {

            int mid = l+r >> 1;
            if (nums[mid] < nums[0]) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }

        return nums[r];
    }

}
