package com.richard.lc;

/**
 * 1588. 所有奇数长度子数组的和
 */
public class LC1588 {

    public int sumOddLengthSubarrays(int[] arr) {

        //arr = [1,4,2,5,3]
        int n = arr.length;
        int[] pre = new int[n + 1];
        // 求前缀和
        for (int i=0; i<n; i++) {
            pre[i+1] = pre[i] + arr[i];
        }

        int sum = 0;
        // 从第一个开始，遍历一第一个为起点的奇数 一次递增
        for (int i = 0; i < n; i++) {
            for (int j = 1; i+j <= n; j+=2) {
                sum += pre[i+j] - pre[i];
            }
        }

        return sum;
    }

}
