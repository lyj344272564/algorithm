package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AcWing 240. 食物链
 */
public class AC240 {

    private static final int N = 50010;
    private static int[] p = new int[N];
    private static int[] d = new int[N];

    private static int find(int x) {
        if (p[x] != x) {
            int t = find(p[x]);
            d[x] += d[p[x]];
            p[x] = t;
        }
        return p[x];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");
        int n = Integer.parseInt(val[0]);
        int k = Integer.parseInt(val[1]);

        int res = 0;

        for (int i=1; i<=n; i++) {
            p[i] = i;
        }


        while (k-- != 0) {

            String[] cur = br.readLine().split(" ");
            int t = Integer.parseInt(cur[0]);
            int x = Integer.parseInt(cur[1]);
            int y = Integer.parseInt(cur[2]);
            if (x>n || y>n) {
                res++;
            } else{
                int px = find(x);
                int py = find(y);
                if (t == 1) {
                    if (px == py && (d[x]-d[y])%3 != 0) {
                        res++;
                    } else if (px != py) {
                        p[px] = py;
                        d[px] = d[y] - d[x];
                    }
                } else {
                    if (px == py && (d[x]-d[y]-1)%3 != 0) {
                        res++;
                    } else if (px != py) {
                        p[px] = py;
                        d[px] = d[y] + 1 - d[x];
                    }
                }
            }
        }
        System.out.println(res);
    }




//    private static final int N = 50010;
//    // parent
//    private static int[] p = new int[N];
//    // 距离
//    private static int[] d = new int[N];
//
//    private static int find(int x) {
//        // x不是树根
//        if (p[x] != x) {
//            int t = find(p[x]);
//            d[x] += d[p[x]];
//            p[x] = t;
//        }
//        return p[x];
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//
//        for (int i=1; i<=N; i++) {
//            p[i] = i;
//        }
//
//        int res = 0;
//        while (K-- != 0) {
//
//            int t = sc.nextInt();
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            if (x>N || y>N) {
//                res++;
//            } else {
//                int px = find(x);
//                int py = find(y);
//                // 判断是否为同类
//                if (t == 1) {
//                    if (px == py && (d[x]-d[y])%3 != 0) {
//                        res++;
//                    } else if (px != py) {
//                        p[px] = py;
//                        d[px] = d[y] - d[x];
//                    }
//                } else {
//                    if (px == py && (d[x]-d[y]-1)%3 != 0) {
//                        res++;
//                    } else if (px != py) {
//                        p[px] = py;
//                        d[px] = d[y] +1 - d[x];
//                    }
//                }
//            }
//        }
//
//        System.out.println(res);
//
//    }

}