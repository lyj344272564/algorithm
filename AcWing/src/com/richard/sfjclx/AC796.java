package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 796. 子矩阵的和
 */
public class AC796 {

    private static int N = 1010;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] val = bf.readLine().split(" ");
        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);
        int q = Integer.parseInt(val[2]);

        int[][] a = new int[N][N];
        int[][] s = new int[N][N];

        for (int i=1; i<=n; i++) {
            String[] cur = bf.readLine().split(" ");
            for (int j=1; j<=m; j++) {
                a[i][j] = Integer.parseInt(cur[j-1]);
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + a[i][j]; // 求前缀和
            }
        }

        while (q-- != 0) {

            String[] cur1 = bf.readLine().split(" ");
            int x1 = Integer.parseInt(cur1[0]);
            int y1 = Integer.parseInt(cur1[1]);
            int x2 = Integer.parseInt(cur1[2]);
            int y2 = Integer.parseInt(cur1[3]);

            System.out.println(s[x2][y2] - s[x1-1][y2] - s[x2][y1-1] + s[x1-1][y1-1]); // 算字矩阵的和
        }
    }
}
