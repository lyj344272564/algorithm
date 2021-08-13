package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 830. 单调栈
 */
public class AC830 {

    private static final int N = 100010;
    private static int[] stk = new int[N];
    private static int tt;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            // 3 4 2 7 5
            while (tt != 0 && stk[tt] >= x) tt--;
            if (tt != 0) {
                System.out.print(stk[tt] + " ");
            } else {
                System.out.print("-1" + " ");
            }
            stk[++tt] = x;
        }

    }
}
