package com.richard.zs;

import java.util.Arrays;

public class 咒语和药水的成功对数 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] res = new int[n];
        Arrays.sort(potions);
        for (int i=0; i<n; i++) {
            int l = 0;
            int r = m - 1;
            long t = success / spells[i] + (success%spells[i] != 0 ? 1 : 0);
            while (l < r) {
                int mid = l + r >> 1;
                if (potions[mid] >= t) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (potions[r] >= t) {
                res[i] = m-1-r+1;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }
}
