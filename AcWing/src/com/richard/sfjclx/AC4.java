package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4. 多重背包问题 I
 */
public class AC4 {

    static final int N = 110;
    static int n, m;
    static int[] v = new int[N];
    static int[] w = new int[N];
    static int[] s = new int[N];
    static int[][] f = new int[N][N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        for (int i=1; i<=n; i++) {

            String[] cur = br.readLine().split(" ");
            v[i] = Integer.parseInt(cur[0]);
            w[i] = Integer.parseInt(cur[1]);
            s[i] = Integer.parseInt(cur[2]);

        }

        for (int i=1; i<=n; i++) {
            for (int j=0; j<=m; j++) {
                for (int k=0; k<=s[i] && k*v[i]<=j; k++) {
                    f[i][j] = Math.max(f[i][j],f[i-1][j-v[i]*k]+w[i]*k);
                }
            }
        }

        System.out.println(f[n][m]);
    }
}
