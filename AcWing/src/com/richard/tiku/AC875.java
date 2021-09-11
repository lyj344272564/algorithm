package com.richard.tiku;

import java.util.Scanner;

/**
 * 875. 快速幂
 */
public class AC875 {

    private static long qmi(long a, int k, int p) {

        long res = 1;

        while (k > 0) {
            if ((k&1) == 1) {
                res = res * a % p;
            }
            a = a * a % p;
            k >>= 1;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            long a = sc.nextLong();
            int k = sc.nextInt();
            int p = sc.nextInt();

            System.out.println(qmi(a,k,p));

        }

    }

}
