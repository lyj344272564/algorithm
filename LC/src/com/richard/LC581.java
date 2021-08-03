package com.richard;

import java.util.Arrays;

/**
 * 排序看对比
 * 利用双指针
 */
public class LC581 {
    public static void main(String[] args) {

    }

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] arr = nums.clone();

        Arrays.sort(arr);

        int i = 0;
        int j = n-1;
        while (i<=j && nums[i]==arr[i]) {
            i++;
        }
        while (i<=j && nums[j]==arr[j]) {
            j--;
        }
        return j-i+1;
    }
}
