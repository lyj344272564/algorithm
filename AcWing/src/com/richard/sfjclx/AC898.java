package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 898. 数字三角形
 */
public class AC898 {

    static int n;
    static final int N = 510;
    static int[][] a = new int[N][N];
    static int[][] f = new int[N][N];
    static final int INF = (int)1e9;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            String[] cur = br.readLine().split(" ");
            for (int j=1; j<=i; j++) {
                a[i][j] = Integer.parseInt(cur[j-1]);
            }
        }

        // 初始化
        for (int i=0; i<=n; i++) {
            // 初始化时i+1 就比如第二行要取一个最大值2,2点会去1,2这个点  所以要多i+1
            for (int j=0; j<=i+1; j++) {
                f[i][j] = -INF;
            }
        }

        f[1][1] = a[1][1];

        for (int i=2; i<=n; i++) {
            for (int j=1; j<=i; j++) {
               f[i][j] = Math.max(f[i-1][j-1]+a[i][j],f[i-1][j]+a[i][j]);
            }
        }

        int res = -INF;
        for (int i=1; i<=n; i++) {
            res = Math.max(f[n][i],res);
        }

        System.out.println(res);

    }

}
