package com.richard.zs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 划分数组使最大差为k {
    public static int partitionArray(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i=0; i<n;) {
            int j = i;
            while (j<n && nums[j]-nums[i]<=k) {
                j++;
            }
            res++;
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 1;
        int res = partitionArray(nums, k);
        System.out.println(res);
    }
}
