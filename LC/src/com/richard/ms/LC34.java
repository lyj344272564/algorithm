package com.richard.ms;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class LC34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }

        int l = 0, r = nums.length - 1;

        while (l < r) {

            int mid = l + r >> 1;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        if (nums[l] != target) {
            return new int[]{-1,-1};
        }

        int L = l;
        l = 0;
        r = nums.length - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return new int[]{L,l};
    }

}
