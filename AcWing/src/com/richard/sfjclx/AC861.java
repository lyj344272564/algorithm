package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 861. 二分图的最大匹配
 */
public class AC861 {

    static int n1;
    static int n2;
    static int m;
    static final int N = 510;
    static final int M = 100010;
    // 领接表
    static int[] h = new int[N];
    static int[] e = new int[M];
    static int[] ne = new int[M];
    static int idx;
    // 右面点对应的点
    static int[] match = new int[N];
    static boolean[] st = new boolean[N];


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] val = bf.readLine().split(" ");
        n1 = Integer.parseInt(val[0]);
        n2 = Integer.parseInt(val[1]);
        m = Integer.parseInt(val[2]);

        Arrays.fill(h,-1);

        while (m-- > 0) {
            String[] cur = bf.readLine().split(" ");
            int a = Integer.parseInt(cur[0]);
            int b = Integer.parseInt(cur[1]);
            add(a,b);
        }

        int res  = 0;
        for (int i=1; i<=n1; i++) {
            Arrays.fill(st,false);
            if (find(i)) {
                res++;
            }
        }
        System.out.println(res);

    }

    static boolean find(int x) {
        for (int i=h[x];i!=-1; i=ne[i]) {
            int j  =e[i];
            if (!st[j]) {
                st[j] = true;
                // 如果没有匹配或者说可以找到下家
                if (match[j] == 0 || find(match[j])) {
                    match[j] = x;
                    return true;
                }
            }
        }
        return false;
    }

    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

}
