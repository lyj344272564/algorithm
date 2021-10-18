package com.richard.ms;

/**
 * 33. 搜索旋转排序数组
 */
public class LC33 {

    public int search(int[] nums, int target) {

        int n = nums.length;

        if (n == 0) {
            return  -1;
        }

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] >= nums[0]) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }

        if (nums[0] <= target) {
            l = 0;
        } else {
            l = r + 1;
            r = n - 1;
        }
        while (l<r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (nums[r] == target) {
            return r;
        }
        return -1;
    }

}
