package com.richard.lc;

/**
 * 704. 二分查找
 */
public class LC704 {
    public int search(int[] a, int x) {

        int l = 0;
        int r = a.length-1;


        while (l<=r) {
            int mid = l+r >> 1;
            if (a[mid]==x) {
                return mid;
            } else if (a[mid]>x) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }

        return -1;
    }
}
