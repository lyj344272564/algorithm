package com.richard.剑指打卡;

import java.util.ArrayList;
import java.util.List;

public class AC75 {

    public int[] findNumbersWithSum(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        for (int x : nums) {
            if (list.contains(target-x)) {
                return new int[]{x,target-x};
            }
            list.add(x);
        }

        return new int[]{};

    }

}