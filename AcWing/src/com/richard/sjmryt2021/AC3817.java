package com.richard.sjmryt2021;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AcWing 3817. 数组
 */
public class AC3817 {

    static int n, m;
    static final int N = 100010;
    static int a, b;
    static int[] A = new int[N];
    static int[] B = new int[N];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<m; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        if (A[a-1] < B[m-b]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


}
