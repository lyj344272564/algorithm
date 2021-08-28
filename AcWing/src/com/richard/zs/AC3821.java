package com.richard.zs;

import java.util.Scanner;

/**
 * 3821. 区间选数
 */
public class AC3821 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();

            int res1 = l1+1;
            int res2 = r2-1;

            if (res1 == res2) {
                res2  += 1;
            }

            System.out.println(res1 + " " + res2);

        }
    }

}
