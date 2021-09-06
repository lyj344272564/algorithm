package com.richard.sfjclx;

import java.util.Scanner;

/**
 * AcWing 842. 排列数字
 */
public class AC842 {

    private static final int N = 10;
    // 路径
    private static int[] path = new int[N];
    // 当前哪个数用过了
    private static boolean[] st = new boolean[N];

    private static void dfs(int u, int n) {
        if (u == n) {
            for (int i=0; i<n ; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i=1; i<=n; i++) {
            if (!st[i]) {
                path[u] = i;
                // 表示用过
                st[i] = true;
                dfs(u+1,n);
                // 恢复现场
                st[i] = false;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dfs(0,n);

    }

}
