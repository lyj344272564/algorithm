package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AcWing 842. 排列数字
 */
public class AC842 {

    static final int N = 10;
    static int[] path = new int[N];
    static boolean[] st = new boolean[N];
    static int n;

    static void dfs(int u) {

        if (u == n) {
            for (int i=0; i<n; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i=1; i<=n; i++) {
            if (!st[i]) {
                path[u] = i;
                st[i] = true;
                dfs(u+1);
                st[i] = false;
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dfs(0);

    }

}
