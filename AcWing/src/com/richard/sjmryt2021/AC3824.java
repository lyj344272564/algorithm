package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3824. 在校时间
 */
public class AC3824 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i=1; i<n-1; i++) {
                if (a[i] == 0 && a[i-1]==1 && a[i+1]==1) {
                    a[i] = 1;
                }
            }
            int res = 0;
            for (int i=0; i<n; i++) {
                if (a[i] == 1) {
                    res++;
                }
            }

            System.out.println(res);
        }

    }

}
