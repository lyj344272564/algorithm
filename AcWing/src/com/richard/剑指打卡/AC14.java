package com.richard.剑指打卡;

/**
 * AcWing 14. 不修改数组找出重复的数字
 * n个位置 n+1个数 类似
 */
public class AC14 {

    public int duplicateInArray(int[] nums) {

        if (nums.length == 0 || nums.length == 1) {
            return -1;
        }

        // 分治法 + 抽屉原理
        int start = 1, end = nums.length - 1;
        while (start < end) {
            int middle = start + end >> 1;
            // 左半边数的个数
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= start && nums[i] <= middle) {
                    count++;
                }
            }
            // 这里的区间应该是middle和start中间的区间
            if (count > middle - start + 1) {
                end = middle;
            } else {
                start = middle + 1; //分为左侧：[start, middle] 和[middle + 1, end] 两个区间
            }

        }


        return end;

    }

}
