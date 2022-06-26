package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AC4480 {
    static final int N = 200010;
    static final int INF = (int) 2e9;
    static int n, m;
    static int[] c = new int[N];
    static int[] a = new int[N]; // 居民
    static int[] b = new int[N]; // 垃圾桶
    static int[] res = new int[N];
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] cur = bf.readLine().split(" ");
        n = Integer.parseInt(cur[0]);
        m = Integer.parseInt(cur[1]);
        cur = bf.readLine().split(" ");
        for (int i=0; i<n+m; i++) {
            c[i] = Integer.parseInt(cur[i]);
        }
        cur = bf.readLine().split(" ");
        for (int i=0,j=0,k=0; i<n+m; i++) {
            int t = Integer.parseInt(cur[i]);
            if (t == 1) {
                b[++j] = c[i];
            } else {
                a[++k] = c[i];
            }
        }
        b[0] = -INF;
        b[m + 1] = INF;
        for (int i=1, j=0; i<=n; i++) {
            while (b[j] < a[i]) j++;
            int r = j;
            if ((long)a[i]-b[r-1] <= (long) b[r]-a[i]) res[r-1]++;
            else res[r]++;
        }
        for (int i=1; i<=m; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
