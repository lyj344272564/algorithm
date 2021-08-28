package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3815. 最大约数
 */
public class AC3815 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            long n = sc.nextLong();

            long res = 1;

            for (int i=2; i<= n/i; i++) {

                if (n % i == 0) {
                    res *= i;
                    while (n%i == 0) {
                        n /= i;
                    }
                }

            }

            res *= n;
            System.out.println(res);

        }

    }

}
