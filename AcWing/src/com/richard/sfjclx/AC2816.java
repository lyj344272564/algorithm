package com.richard.sfjclx;

import java.util.Scanner;

/**
 * AcWing 2816. 判断子序列
 */
public class AC2816 {

    private static final int N = 100010;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];


        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int j=0; j<m; j++) {
            b[j] = scanner.nextInt();
        }

        int i=0;
        for (int j=0; j<m; j++) {
            if (a[i] == b[j] && i<n) i++;
        }
        if (i==n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }

}
