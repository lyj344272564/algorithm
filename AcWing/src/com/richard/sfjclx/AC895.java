package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 895. 最长上升子序列
 */
public class AC895 {

    static int n;
    static final int N = 1010;
    static int[] a = new int[N];
    static int[] f = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        String[] cur = br.readLine().split(" ");

        for (int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(cur[i-1]);
        }

        for (int i=1; i<=n; i++) {
            f[i] = 1;
            for (int j=1; j<i; j++) {
                // 这里不加=是因为上面已经是1   f[i] = 1;
                if (a[j] < a[i]) {
                    f[i] = Math.max(f[i],f[j] + 1);
                }
            }
        }

        int res = 0;
        for (int i=1; i<=n; i++) {
            res = Math.max(f[i],res);
        }

        System.out.println(res);

    }

}
