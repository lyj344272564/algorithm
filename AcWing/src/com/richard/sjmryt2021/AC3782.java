package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * AcWing 3782. 点
 */
public class AC3782 {

    private static int N = 100010;
    private static int n;

    public static Long get(Long[] x) {

        Long s1 = Long.valueOf(0);
        Long s2 = Long.valueOf(0);

        for(int i=0; i<n; i++) {
            s1 += x[i] * x[i];
            s2 += x[i];
        }

        return (n-1)*s1 - (s2*s2-s1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 几个点
        n = sc.nextInt();

        Long[] x = new Long[N];
        Long[] y = new Long[N];

        for (int i=0; i<n; i++) {

            x[i] = sc.nextLong();
            y[i] = sc.nextLong();

        }

        System.out.println((get(x)+get(y)));

    }
}
