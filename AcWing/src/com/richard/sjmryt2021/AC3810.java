package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3810. 最长连续休息时间
 */
public class AC3810 {

    private static final int N = 200010;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int[] a = new int[N];

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                a[n+i] = a[i];
            }

            int res = 0;

            // j就是串的长度
            for (int i=0,j=0; i<2*n; i++) {
                if (a[i] == 1) {
                    j++;
                    res = Math.max(j,res);
                } else {
                    j = 0;
                }
            }

            System.out.println(res);
        }

    }

}
