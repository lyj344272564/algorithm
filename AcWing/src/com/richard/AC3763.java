package com.richard;

import java.util.Scanner;

/**
 *
 AcWing 3763. 数字矩阵
 */
public class AC3763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int cnt = 0; // 负数的个数
            int sum = 0;
            int min = 102;

            for (int i=0; i<n*m; i++) {
                int x = sc.nextInt();
                sum += Math.abs(x);
                min = Math.min(min,Math.abs(x));
                if (x<0) cnt++;
            }

            if (cnt % 2 != 0) {
                System.out.println(sum-2*min);
            } else {
                System.out.println(sum);
            }

        }
    }
}
