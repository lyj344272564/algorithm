package com.richard.lc;

public class LC441 {

    public int arrangeCoins(int n) {

//       return (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
        int l = 1;
        int r = n;

        while (l < r) {
            int mid = (r - l + 1) / 2 + l;
            if ((long)mid*(mid+1) <= (long)2*n) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }

        return l;

    }
}
