package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9. 分组背包问题
 */
public class AC9 {

    static final int N = 110;
    static int n,m;
    static int[][] v = new int[N][N];
    static int[][] w = new int[N][N];
    static int[] f = new int[N];
    static int[] s = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        for (int i=1; i<=n; i++) {

            s[i] = Integer.parseInt(br.readLine());
            for (int j=0; j<s[i]; j++) {
                String[] cur = br.readLine().split(" ");
                v[i][j] = Integer.parseInt(cur[0]);
                w[i][j] = Integer.parseInt(cur[1]);

            }

        }

        for (int i=1; i<=n; i++) {
            for (int j=m; j>=0; j--) {
                for (int k=0; k<s[i]; k++) {
                    if (j >= v[i][k]) {
                        f[j] = Math.max(f[j],f[j-v[i][k]]+w[i][k]);
                    }
                }
            }
        }

        System.out.println(f[m]);
    }

}
