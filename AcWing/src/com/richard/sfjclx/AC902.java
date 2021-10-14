package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 902. 最短编辑距离
 */
public class AC902 {

    static int n, m;
    static final int N = 1010;
    static int[][] f = new int[N][N];
    static char[] a = new char[N];
    static char[] b = new char[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        String replace = br.readLine().replace(" ", "");
        a = replace.toCharArray();

        m = Integer.parseInt(br.readLine());
        replace = br.readLine().replace(" ", "");
        b = replace.toCharArray();

        for (int i=0; i<=m; i++) {
            f[0][i] = i;
        }

        for (int i=0; i<=n; i++) {
            f[i][0] = i;
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                f[i][j] = Math.min(f[i-1][j]+1,f[i][j-1]+1);
                if (a[i-1] == b[j-1]) {
                    f[i][j] = Math.min(f[i][j],f[i-1][j-1]);
                } else {
                    f[i][j] = Math.min(f[i][j],f[i-1][j-1]+1);
                }
            }
        }


        System.out.println(f[n][m]);

    }

}
