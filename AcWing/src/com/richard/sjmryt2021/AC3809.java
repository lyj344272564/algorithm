package com.richard.sjmryt2021;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3809. 修改数组
 */
public class AC3809 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int mid = a[n/2];
            int res_t = 0; // 数
            int res_c = Integer.MAX_VALUE; // 最小代价

            for (int i=mid-1;i<=mid+1; i++) {
                int cost = 0;
                for (int j=0; j<n; j++) {
                    cost += Math.max(Math.abs(i-a[j])-1,0);
                }
                if (cost < res_c) {
                    res_t = i;
                    res_c = cost;
                }
            }
            System.out.println(res_t + " " + res_c);

        }

    }

}
