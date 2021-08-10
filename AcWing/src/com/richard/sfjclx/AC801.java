package com.richard.sfjclx;

import java.util.Scanner;

/**
 * AcWing 801. 二进制中1的个数
 * 位运算
 */
public class AC801 {
    private static int lowbit(int x) {
        return x & -x;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- != 0) {

            int x = sc.nextInt();
            int res = 0;

            while (x != 0) {
                // 每次减去最后一个1 减多少次就是有多少个1
                x -= lowbit(x);
                res++;
            }

            System.out.println(res);

        }

    }

}
