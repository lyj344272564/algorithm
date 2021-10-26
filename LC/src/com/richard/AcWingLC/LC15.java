package com.richard.AcWingLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++) {
            // 一样就跳过
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for (int j=i+1,k=nums.length-1; j<k; j++) {
                // j 不是第一个数 并且 一样就跳过
                if (j>i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                // 下一个数没有重叠  并且   试探
                while (j<k-1 && nums[i]+nums[j]+nums[k-1]>=0) {
                    k--;
                }
                if (0 == nums[i] + nums[j] + nums[k]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                }
            }

        }
        return res;

    }

}
