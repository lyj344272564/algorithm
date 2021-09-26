package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 829. 模拟队列
 */
public class AC829 {

    private static final int N = 100010;
    private static int[] q = new int[N];
    private static int hh = 0;
    private static int tt = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        while (M-- != 0) {

            String[] cur = br.readLine().split(" ");

            if (cur[0].equals("push")) {
                q[++tt] = Integer.parseInt(cur[1]);
            } else if (cur[0].equals("pop")) {
                hh++;
            } else if (cur[0].equals("empty")) {
                System.out.println(hh<=tt?"NO":"YES");
            } else {
                System.out.println(q[hh]);
            }

        }

    }



//
//    private static final int N = 100010;
//    private static int[] q = new int[N];
//    private static int hh = 0;
//    private static int tt = -1;
//
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int M = sc.nextInt();
//
//        while (M-- != 0) {
//
//            String op = sc.next();
//            if (op.equals("push")) {
//                int x = sc.nextInt();
//                q[++tt] = x;
//            } else if (op.equals("pop")) {
//                hh++;
//            } else if (op.equals("empty")) {
//                System.out.println(hh <= tt ? "NO" : "YES");
//            } else {
//                System.out.println(q[hh]);
//            }
//
//        }
//
//    }
}
