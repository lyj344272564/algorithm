package com.richard.剑指打卡;

import java.util.HashMap;
import java.util.Map;

/**
 * 67. 数字在排序数组中出现的次数
 */
public class AC67 {

    public int getNumberOfK(int[] nums, int k) {

        if (nums.length == 0) {
            return 0;
        }

        int l = 0;
        int r = nums.length - 1;

        // 先找左端点
        while (l < r) {
            int mid = l + r >> 1;

            if (nums[mid] >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }

        int left = l;
        if (nums[l] != k) {
            return 0;
        }
        l = 0;
        r = nums.length - 1;

        while (l<r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] <= k) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }

        return r - left + 1;

    }
}
