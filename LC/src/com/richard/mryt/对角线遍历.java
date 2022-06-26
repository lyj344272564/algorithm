package com.richard.mryt;

/**
 * Author: Richard
 * Date: 2022-06-14 8:18
 */
public class 对角线遍历 {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] res = new int[m*n];
        int k = 0;
        for (int i=0; i<n+m-1; i++) {
            if ((i&1) == 0) { // 从下往上
                // j 是行号，我们发现行号等于min(n-1, i) i>n-1的时候，行就是n-1
                for (int j=Math.min(i, n-1); j>=Math.max(1-m+i,0); j--) {
                    res[k++] = mat[j][i-j];
                }
            } else { // 从上往下
                for (int j=Math.max(1-m+i,0); j<=Math.min(i, n-1); j++) {
                    res[k++] = mat[j][i-j];
                }
            }
        }
        return res;
    }
}

