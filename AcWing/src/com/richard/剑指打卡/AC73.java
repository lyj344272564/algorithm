package com.richard.剑指打卡;

public class AC73 {

    public int[] findNumsAppearOnce(int[] nums) {

        int sum = 0;

        for (int x : nums) {
            sum ^= x;
        }

        int k = 0;
        while (0 != (sum >> k & 1)) {
            k++;
        }

        int first = 0;
        for (int x : nums) {
            if (1 == (x >> k & 1)) {
                first ^= x;
            }
        }

        return new int[]{first, sum^first};

    }
}
