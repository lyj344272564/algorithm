package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 2. 01背包问题
 */
public class AC2 {
    static final int N = 1010;
    static int n,m;
    static int[] v = new int[N];
    static int[] w = new int[N];
    // 集合的某种属性  最终会落实到某一个性质上去
//    static int[][] f = new int[N][N];
    static int[] f = new int[N];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        for (int i=1; i<=n; i++) {
            String[] cur = br.readLine().split(" ");
            v[i] = Integer.parseInt(cur[0]);
            w[i] = Integer.parseInt(cur[1]);
        }

        for (int i=1; i<=n; i++) {
            for (int j=m; j>=v[i]; j--) {
                f[j] = Math.max(f[j],f[j-v[i]]+w[i]);
//                f[i][j] = Math.max(f[i][j], f[i][j-v[i]]+w[i]);

            }
        }
        System.out.println(f[m]);
//        二维
//        for (int i=1; i<=n; i++) {
//            for (int j=0; j<=m; j++) {
//                // 不含
//                f[i][j] = f[i-1][j];
//                // 含i   从一到i中选
//                if (j >= v[i]) {
//                    f[i][j] = Math.max(f[i][j],f[i-1][j-v[i]]+w[i]);
//                }
//            }
//        }
//        System.out.println(f[n][m]);
    }
}