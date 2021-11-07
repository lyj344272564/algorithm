package com.richard.剑指打卡;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AC74 {
    public int findNumberAppearingOnce(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x,false);
            } else {
                map.put(x,true);
            }
        }

        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            if (map.get(integer)) {
                return integer;
            }
        }
        return -1;
    }
}
