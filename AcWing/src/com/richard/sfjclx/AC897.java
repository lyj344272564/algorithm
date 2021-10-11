package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 897. 最长公共子序列
 */
public class AC897 {

    static final int N = 1010;
    static int n, m;
    static int[][] f = new int[N][N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        String replace = br.readLine().replace(" ", "");
        char[] a = replace.toCharArray();
        replace = br.readLine().replace(" ", "");
        char[] b = replace.toCharArray();


        for (int i=1; i<n; i++) {
            for (int j=1; j<=m; j++) {
                f[i][j] = Math.max(f[i-1][j],f[i][j-1]);
                if (a[i-1] == b[j-1]) {
                    f[i][j] = Math.max(f[i][j],f[i-1][j-1]+1);
                }
            }
        }

        System.out.println(f[n][m]);

    }

}
