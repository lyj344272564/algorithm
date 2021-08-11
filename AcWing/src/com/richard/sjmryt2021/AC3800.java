package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3800. 奇数还是偶数
 */
public class AC3800 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int b = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[k];

            long n = 0;
            int sum = 0;
            int last = 0;


//            for (int i=0; i<k; i++) {
//                a[i] = sc.nextInt();
//            }
//
//            for (int i=0,j=k; i<k&&j>0; i++,j--) {
//                n += a[i] * Math.pow(b,j-1);
//            }
//
//            if (n%2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }



            for (int i=0; i<k; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                last = a[i];
            }

            // b是偶数
            int res = last % 2;

            // b是奇数
            if (b % 2 == 1) {
                // 为啥不用*b  是因为 %2之后和1是一样的 可以省略
                res = sum % 2;
            }

            if (res == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }

    }

}
