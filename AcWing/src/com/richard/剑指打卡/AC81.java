package com.richard.剑指打卡;

import java.util.Arrays;

/**
 * 判断长度是否小于5
 * 排序
 * 删 0
 * 判断重复
 * 差是否小于 4
 */
public class AC81 {

    public boolean isContinuous(int [] nums) {

        if (nums.length < 5) {
            return false;
        }

        Arrays.sort(nums);
        int k = 0;
        while (0 == nums[k]) {
            k++;
        }

        for (int i=k+1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return false;
            }
        }

        return nums[nums.length-1] - nums[k] <= 4;

    }
}
