package com.richard.AcWingLC;

import java.util.TooManyListenersException;

/**
 * 4. 寻找两个正序数组的中位数
 */
public class LC4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int temp[] = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<n && j<m) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        while (i<n) {
            temp[k++] = nums1[i++];
        }
        while (j<m) {
            temp[k++] = nums2[j++];
        }

        double res = 0;
        int mid = (m+n)/2;
        if ((m+n)%2 == 0) {
            res = (double)(temp[mid-1] + temp[mid])/2;
        } else {
            res = temp[mid];
        }

        return res;
    }

}
