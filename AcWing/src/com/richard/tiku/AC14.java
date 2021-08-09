package com.richard.tiku;


import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 14. 不修改数组找出重复的数字
 */
public class AC14 {

    public int duplicateInArray(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (list.contains(nums[i])) {
                return nums[i];
            } else {
                list.add(nums[i]);
            }
        }
        return 0;
    }

    public int duplicateInArray2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }
        return 0;
    }

}
