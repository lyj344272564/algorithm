package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 143. 最大异或对
 * 位运算
 * 异或相同为0 不同为1
 * & (1&1=0) (0&0=0) (0&1=1)
 */
public class AC143 {

    private static final int N = 100010;
    private static final int M = 3100010;

    private static int[] a = new int[N];
    private static int[][] son = new int[M][2];
    private static int idx = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] cur = br.readLine().split(" ");

        int res = 0;

        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
            insert(a[i]);
            res = Math.max(res, query(a[i]));
        }

        System.out.println(res);

    }

    private static void insert(int x) {
        int p = 0;
        for (int i=30; i>=0; i--) {
            int u = x >> i & 1;
            if (son[p][u] == 0) {
                son[p][u] = ++idx;
            }
            p = son[p][u];
        }
    }

    private static int query(int x) {
        int p = 0;
        int res = 0;
        for (int i=30; i>=0; i--) {
            int u = x >> i & 1;
            if (son[p][u^1] != 0) {
                p = son[p][u^1];
                res = (res << 1) + u^1;
            } else {
                p = son[p][u];
                res = res << 1;
            }
        }
        return res;
    }

}
