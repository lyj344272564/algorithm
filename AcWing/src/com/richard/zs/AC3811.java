package com.richard.zs;

import java.util.Scanner;

/**
 * 3811. 排列
 */
public class AC3811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();

            for (int i=1; i<=n; i++) {
                System.out.print(i%n+1 + " ");
            }
            System.out.println();

        }
    }
}
