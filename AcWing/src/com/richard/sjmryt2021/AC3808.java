package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3808. 画正方形
 */
public class AC3808 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {
            int n = sc.nextInt();
            int x = (int)Math.sqrt(n);
            if (x*x == n) {
                System.out.println(2*x);
            } else {
                if (n-x*x <= x) {
                    System.out.println(2*x+1);
                } else {
                    System.out.println(2*x+2);
                }
            }
        }

    }
}
