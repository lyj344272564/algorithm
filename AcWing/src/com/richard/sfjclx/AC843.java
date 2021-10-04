package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 843. n-皇后问题
 */
public class AC843 {

    private static final int N = 20;
    private static int[] path = new int[N];
    private static char[][] g = new char[N][N];
    private static boolean[] col = new boolean[N];
    private static boolean[] dj = new boolean[N];
    private static boolean[] udj = new boolean[N];
    private static int n;

    private static void dfs(int u) {

        if (u == n) {

            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    System.out.print(g[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i=0; i<n; i++) {
            if (!col[i] && !dj[u+i] && !udj[n-u+i]) {
                g[u][i] = 'Q';
                col[i] = dj[u+i] = udj[n-u+i] = true;
                dfs(u+1);
                // 恢复现场
                col[i] = dj[u+i] = udj[n-u+i] = false;
                g[u][i] = '.';
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                g[i][j] = '.';
            }
        }

        dfs(0);
    }

}