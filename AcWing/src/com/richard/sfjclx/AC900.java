package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 900. 整数划分
 */
/**
 * 首先，对f[0]赋值1
 * 相当于f[0][0~n] = 1,因为是滚动数组所以只设置一个就可以
 *
 * 状态转移：
 *      f[i][j] = f[i-1][j]+f[i-1][j-i]+f[i-2][j-2*i]+...
 *      f[i][j]:从1~i中选择，总和为j的方案数量
 *      优化方程：
 *      1. f[i][j] = f[i-1][j]+f[i][j-i];
 *      2. f[j] = f[j]+f[j-i];
 */
public class AC900 {

    static int n;
    static final int N = 1010;
//    static int[] f = new int[N];
    static int[][] f = new int[N][N];
    static final int mod = (int)1e9+7;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
//
//        f[0] = 1;
//
//        for (int i=1; i<=n; i++) {
//            for (int j=i; j<=n; j++) {
//               f[j] = (f[j] + f[j-i]) % mod;
//            }
//        }
//
//        System.out.println(f[n]);

        f[0][0] = 1;

        f[0][0] = 1;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                f[i][j] = (f[i-1][j-1] + f[i-j][j]) % mod;
            }
        }

        int res = 0;
        for (int i=1; i<=n; i++) {
            res = (res + f[n][i]) % mod;
        }

        System.out.println(res);

    }

}
