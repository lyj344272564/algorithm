package com.richard.sfjc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 828. 模拟栈
 */
public class 模拟栈 {

    private static final int N = 100010;
    private static int[] stk = new int[N];
    private static int tt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        while (M-- != 0) {

            String[] cur = br.readLine().split(" ");

            if (cur[0].equals("push")) {
                stk[++tt] = Integer.parseInt(cur[1]);
            } else if (cur[0].equals("pop")) {
                tt--;
            } else if (cur[0].equals("empty")) {
                System.out.println(tt==0?"YES":"NO");
            } else {
                System.out.println(stk[tt]);
            }

        }

    }















//    private static final int N = 100010;
//    private static int[] stk = new int[N];
//    //栈底下标
//    private static int tt = 0;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int M = sc.nextInt();
//
//        while (M-- != 0) {
//            String op = sc.next();
//            if (op.equals("push")) {
//                int x = sc.nextInt();
//                stk[++tt] = x;
//            } else if (op.equals("pop")){
//                tt--;
//            } else if (op.equals("empty")) {
//                System.out.println(tt != 0 ? "NO" : "YES");
//            } else {
//                System.out.println(stk[tt]);
//            }
//        }
//
//    }

}
