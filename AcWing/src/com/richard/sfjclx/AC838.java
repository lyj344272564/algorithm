package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 838. 堆排序
 */
public class AC838 {

    private static final int N = 100010;

    private static int[] h = new int[N];
    private static int size = 0;

    private static void down(int u) {
        int t = u;
        if (u*2 <= size && h[u*2] < h[t]) {
            t = u*2;
        }
        if (u*2+1 <= size && h[u*2+1]<h[t]) {
            t = u*2+1;
        }
        // 证明可以down 也可以成为递归终止条件
        if (u != t) {
            int temp = h[u];
            h[u] = h[t];
            h[t] = temp;
            // 继续down
            down(t);
        }
    }

    private static void up(int x) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        size = n;
        for (int i=0; i<n; i++) {
            h[i] = sc.nextInt();
        }

        for (int i=n/2; i>=0; i--) {
            down(i);
        }

        while (m-- != 0) {
            System.out.print(h[1] + " ");
            h[1] = h[size];
            size--;
            down(1);
        }

    }

}
