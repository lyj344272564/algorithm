package com.richard.ms;

/**
 * 162. 寻找峰值
 */
public class LC162 {

    public int findPeakElement(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + r >> 1;
            // mid+1 不会越界
            if (nums[mid] > nums[mid+1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;

    }

}
