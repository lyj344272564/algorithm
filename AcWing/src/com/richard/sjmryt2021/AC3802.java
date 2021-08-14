package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3802. 消灭数组
 */
public class AC3802 {

    private static final int N = 20;
    private static int[] a = new int[N];

    private static int calculate(int l, int r) {
        int mid = l+r >> 1;
        boolean flag = true;
        for (int i=l+1; i<=r; i++) {
            // 产生逆序
            if (a[i]<a[i-1]) {
                flag = false;
                break;
            }
        }
        // 每次判断完遇到顺序都会算一次
        if (flag) {
            return r-l+1;
        }
        return Math.max(calculate(l,mid),calculate(mid+1,r));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            int ret = calculate(0,n-1);

            System.out.println(ret);

        }

    }

}
