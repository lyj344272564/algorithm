package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3. 完全背包问题
 */
public class AC3 {

    static final int N = 1010;
    static int n, m;
    static int[] v = new int[N];
    static int[] w = new int[N];
//    static int[][] f = new int[N][N];
    static int[] f = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        for (int i=1; i<=n; i++) {

            String[] cur = br.readLine().split(" ");
            v[i] = Integer.parseInt(cur[0]);
            w[i] = Integer.parseInt(cur[1]);

        }

//        第一 三维
//        for (int i=1; i<=n; i++) {
//            for (int j=0; j<=m; j++) {
//                   for (int k=0; k*v[i]<=j; k++) {
//                        f[i][j] = Math.max(f[i][j],f[i-1][j-k*v[i]]+k*w[i]);
//                   }
//            }
//        }
//
//        System.out.println(f[n][m]);

        // 第二  二维
//        for (int i=1; i<=n; i++) {
//            for (int j=0; j<=m; j++) {
//                f[i][j] = f[i-1][j];
//                if (j >= v[i]) {
//                    f[i][j] = Math.max(f[i][j],f[i][j-v[i]]+w[i]);
//                }
//            }
//        }
//        System.out.println(f[n][m]);


        // 第三 一维
        for (int i=1; i<=n; i++) {
            for (int j=v[i]; j<=m; j++) {
                f[j] = Math.max(f[j],f[j-v[i]]+w[i]);
            }
        }
        System.out.println(f[m]);

    }

}