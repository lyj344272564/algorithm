package com.richard.sfjc;

import java.util.Scanner;

/**
 * 828. 模拟栈
 */
public class 模拟栈 {

    private static final int N = 100010;
    private static int[] stk = new int[N];
    //栈底下标
    private static int tt = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        while (M-- != 0) {
            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                stk[++tt] = x;
            } else if (op.equals("pop")){
                tt--;
            } else if (op.equals("empty")) {
                System.out.println(tt!=0?"NO":"YES");
            } else {
                System.out.println(stk[tt]);
            }
        }

    }

}
