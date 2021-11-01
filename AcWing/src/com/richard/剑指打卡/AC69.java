package com.richard.剑指打卡;

public class AC69 {

    public int getNumberSameAsIndex(int[] nums) {

        if (0 == nums.length) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= mid) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (nums[l] == l) {
            return l;
        }
        return -1;
    }
}
