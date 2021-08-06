package com.richard.sjmryt2021;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * 3790. 录入单词
 */
public class AC3790 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int res =0;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i=0; i<n-1; i++) {
            if (a[i+1]-a[i] <= c) {
                res++;
            }
            if (a[i+1]-a[i] > c) {
                res = 0;
            }
        }

        // 最后加上第一个输入
        System.out.println(res+1);

    }

}
