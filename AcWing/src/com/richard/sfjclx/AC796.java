package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 796. 子矩阵的和
 */
public class AC796 {

    private static int N = 1010;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int[][] a = new int[N][N];
        int[][] s = new int[N][N];

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                a[i][j] = sc.nextInt();
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + a[i][j]; // 求前缀和
            }
        }

        while (q-- != 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println(s[x2][y2]-s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1]); // 算字矩阵的和
        }
    }
}
