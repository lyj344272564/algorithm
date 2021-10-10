package com.richard.lc;

/**
 * 1109. 航班预订统计
 */
public class LC1109 {
    public int[] corpFlightBookings(int[][] a, int n) {

        int[] b = new int[n+1];

        for (int[] c : a) {
            int l = c[0]-1;
            int r = c[1]-1;
            int v = c[2];
            b[l] += v;
            b[r+1] -= v;

        }

        int[] res = new int[n];

        res[0] = b[0];

        for (int i=1; i<n; i++) {
            res[i] = res[i-1] + b[i];
        }
        return res;
    }
}
