package com.richard.sfjclx;

import java.net.SocketTimeoutException;
import java.util.Scanner;

/**
 * 843. n-皇后问题
 */
public class AC843 {

    private static final int N = 20;
    private static char[][] g = new char[N][N];
    private static boolean[] col = new boolean[N];
    private static boolean[] dj = new boolean[N];
    private static boolean[] udj = new boolean[N];

    private static void dfs(int u, int n) {
        if (u == n) {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
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
                // 表示用过
                col[i] = dj[u+i] = udj[n-u+i] = true;
                dfs(u+1,n);
                // 恢复现场
                col[i] = dj[u+i] = udj[n-u+i] = false;
                g[u][i] = '.';
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                g[i][j] = '.';
            }
        }



        dfs(0,n);

    }

}
