package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 829. 模拟队列
 */
public class AC829 {

    private static final int N = 100010;
    private static int[] q = new int[N];
    private static int hh = 0;
    private static int tt = -1;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        while (M-- != 0) {

            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                q[++tt] = x;
            } else if (op.equals("pop")) {
                hh++;
            } else if (op.equals("empty")) {
                System.out.println(hh <= tt ? "NO" : "YES");
            } else {
                System.out.println(q[hh]);
            }

        }

    }
}
