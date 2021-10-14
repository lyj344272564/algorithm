package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 896. 最长上升子序列 II
 */
public class AC896 {

    static int n;
    static final int N = 100010;
    static int[] a = new int[N];
    // 所有不同长度下上升子序列的最小值
    static int[] q = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        String[] cur = br.readLine().split(" ");

        for (int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(cur[i-1]);
        }

        int len = 0;
        q[0] = (int)-2e9;
        for (int i=1; i<=n; i++) {
            int l = 0;
            int r = len;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (q[mid] < a[i]) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            len = Math.max(len, r+1);
            q[r+1] = a[i];
        }
        System.out.println(len);

    }

}