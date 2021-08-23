package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 143. 最大异或对
 * 位运算
 * 相同为1 不同为0
 * & (1&1=1) (0&0=0) (0&1=0)
 */
public class AC143 {

    private static final int N = 100010;
    private static final int M = 3100010;

    private static int[] a = new int[N];
    private static int[][] son = new int[M][2];
    private static int idx = 0;

    private static void insert(int x) {
        int p=0;
        for (int i=30; i>=0; i--) {
            int u = (x>>i)&1;
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
           int u = (x>>i)&1;
           // 另外一个数
           if (son[p][u ^ 1] != 0) {
               res = (res << 1) + 1;
               u = u ^ 1;
           } else {
               res = res << 1;
           }
           p = son[p][u];
       }
       return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int res = 0;
        for (int i=0; i<n; i++) {
            insert(a[i]);
            res = Math.max(res,query(a[i]));
        }

        System.out.println(res);
    }

}
