package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 282. 石子合并
 */
public class AC282 {

    static final int N = 301;
    static int[] s = new int[N];
    static int[][] f = new int[N][N];
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        String[] cur = br.readLine().split(" ");
        for (int i=1; i<=n; i++) {
            s[i] = Integer.parseInt(cur[i-1]);
        }

        for (int i=1; i<=n; i++) {
            s[i] += s[i-1];
        }

        for (int len=2; len<=n; len++) {
            for (int i=1; i+len-1<=n; i++) {
                int l = i;
                int r = i + len - 1;
                f[l][r] = (int)1e9;
                for (int k=l; k<r; k++) {
                    f[l][r] = Math.min(f[l][r],f[l][k]+f[k+1][r]+ s[r]-s[l-1]);
                }

            }
        }
        System.out.println(f[1][n]);
    }

}
