package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AcWing 842. 排列数字
 */
public class AC842 {

    private static final int N = 10;
    private static int[] path = new int[N];
    private static boolean[] st = new boolean[N];
    private static int n;

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




//    private static final int N = 10;
//    private static int[] path = new int[N];
//    //哪些数被用过了
//    private static boolean[] st = new boolean[N];
//    private static int n;
//
//    private static void dfs(int u) {
//        if (u == n) {
//            for (int i=0; i<n; i++) {
//                System.out.print(path[i] + " ");
//            }
//            System.out.println();
//            return;
//        }
//        for (int i=1; i<=n; i++) {
//            if (!st[i]) {
//                path[u] = i;
//                st[i] = true;
//                dfs(u+1);
//                st[i] = false;
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        n = Integer.parseInt(br.readLine());
//
//        dfs(0);
//
//    }

}
