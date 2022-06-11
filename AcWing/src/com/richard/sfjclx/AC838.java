package com.richard.sfjclx;

import java.io.*;

/**
 * 838. 堆排序
 */
public class AC838 {

    private static final int N = 100010;
    private static int[] h = new int[N];
    private static int size = 0;

    private static void down(int u) {

        int t = u;
        if (2*u<size && h[2*u]<h[t]) {
            t = u*2;
        }
        if (2*u+1<size && h[2*u+1]<h[t]) {
            t = u*2+1;
        }

        if (u != t) {
            int temp = h[u];
            h[u] = h[t];
            h[t] = temp;
            down(t);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] val = br.readLine().split(" ");
        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);

        size = n;
        String[] cur = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
             h[i+1] = Integer.parseInt(cur[i]);
        }

        for (int i=n/2; i>=0; i--) {
            down(i);
        }

        while (m-- != 0) {
//            bw.write(h[1] + " ");
            System.out.print(h[1] + " ");
            h[1] = h[size];
            size--;
            down(1);
        }

    }

}
