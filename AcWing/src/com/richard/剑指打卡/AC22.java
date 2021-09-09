package com.richard.剑指打卡;

/**
 * 22. 旋转数组的最小数字
 */
public class AC22 {

    public int findMin(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }
        int n = nums.length - 1;
        while (n>0 && nums[n] == nums[0]) {
            n--;
        }
        if (nums[n] >= nums[0]) {
            return nums[0];
        }
        int l = 0;
        int r = n;
        System.out.println(l + " " + n);
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
