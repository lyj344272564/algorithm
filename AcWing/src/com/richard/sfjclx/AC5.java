package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5. 多重背包问题 II
 */
public class AC5 {

    static final int N = 200010;
    static int n, m;
    // 体积
    static int[] v = new int[N];
    // 价值
    static int[] w = new int[N];
    static int[] s = new int[N];
    static int[] f = new int[N];
    // static int[] f = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        int cnt = 0;
        for (int i=1; i<=n; i++) {

            String[] cur = br.readLine().split(" ");
            int a  = Integer.parseInt(cur[0]);
            int b  = Integer.parseInt(cur[1]);
            int s  = Integer.parseInt(cur[2]);
            int k = 1;

            while (k <= s) {
                cnt++;
                v[cnt] = a*k;
                w[cnt] = b*k;
                s -= k;
                k *= 2;
            }

            // 剩下的
            if (s > 0) {
                cnt++;
                v[cnt] = a*s;
                w[cnt] = b*s;
            }
            System.out.println("cnt=" + cnt);
        }

        n = cnt;
        for (int i=1; i<=n; i++) {
            for (int j=m; j>=v[i]; j--) {
                f[j] = Math.max(f[j],f[j-v[i]]+w[i]);
            }
        }

        System.out.println(f[m]);

    }
}