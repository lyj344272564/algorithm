package com.richard.AcWingLC;

public class LC251 {

    public int findKthLargest(int[] nums, int k) {

        quick_start(nums,0,nums.length-1);

        return nums[nums.length-k];

    }

    static void quick_start(int q[], int l, int r) {

        if (l >= r) {
            return;
        }

        int x = q[l];
        int i = l - 1;
        int j = r + 1;

        while (i<j) {
            do {
                i++;
            } while (q[i]<x);
            do {
                j--;
            } while (q[j]>x);
            if (i<j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        quick_start(q,l,j);
        quick_start(q,j+1,r);

    }
}
