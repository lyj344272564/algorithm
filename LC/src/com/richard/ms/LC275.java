package com.richard.ms;

import java.util.Arrays;

/**
 * 275. H 指数 II
 */
public class LC275 {

    public int hIndex(int[] citations) {

        int n = citations.length;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int mid = l + r + 1 >> 1;

            if (citations[n-mid] >= mid) {
                l = mid;
            } else {
                r = mid - 1;
            }

        }
        return n-l;
//        int n = citations.length;
//        for (int i=n; i>0; i--) {
//            if (citations[n-i] >= i) {
//                return i;
//            }
//        }
//        return 0;
    }

}
