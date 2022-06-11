package com.richard.zs;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 替换数组中的元素 {
    public int[] arrayChange(int[] nums, int[][] ops) {
        int m = ops.length;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            map.put(nums[i], i);
        }
        int i = 0;
        while (i!=m) {
            if (map.containsKey(ops[i][0]) && !map.containsKey(ops[i][1])) {
                int x = map.get(ops[i][0]);
                nums[map.get(ops[i][0])] = ops[i][1];
                map.remove(ops[i][0]);
                map.put(ops[i][1], x);
            }
            i++;
        }
        return nums;
    }
}
