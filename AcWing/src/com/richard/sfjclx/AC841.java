package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  841. 字符串哈希
 */
public class AC841 {

    static final int N = 100010;
    static final int P = 131;
    static long h[] = new long[N];
    static long p[] = new long[N];

    private static long get(int l, int r) {
        return h[r] - h[l-1]*p[r-l+1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);

        String s = " " + br.readLine();
        char[] a = s.toCharArray();

        p[0] = 1;
        for (int i=1; i<=n; i++) {
            h[i] = h[i-1] * P + a[i];
            p[i] = p[i-1] * P;
        }

        while (m-- != 0) {
            String[] cur = br.readLine().split(" ");
            int l1 = Integer.parseInt(cur[0]);
            int r1 = Integer.parseInt(cur[1]);
            int l2 = Integer.parseInt(cur[2]);
            int r2 = Integer.parseInt(cur[3]);
            System.out.println(get(l1,r1)==get(l2,r2)?"Yes":"No");
        }

    }


//
//    static int N = 100010,P = 131;
//    static long h[] = new long[N];
//    // 存储p的多少次方
//    static long p[] = new long[N];
//
////      1           2          3        4        5
////      a[1]*10000 a[2]*1000 a[3]*100 a[4]*10  a[5]*1
////      a[1]*100   a[2]*10   a[3]*1
////      第二行需要乘上100再被第一行减，才能得到4 5位置的数字
//    private static long get(int l, int r) {
//        return h[r] - h[l-1]*p[r-l+1];
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] val = br.readLine().split(" ");
//
//        int n = Integer.parseInt(val[0]);
//        int m = Integer.parseInt(val[1]);
//
//        String s1 = " " + br.readLine();
//        char[] a = s1.toCharArray();
//
//        p[0] = 1;
//
//        for (int i = 1; i <= n; i++) {
//            h[i] = h[i - 1] * P + a[i];
//            p[i] = p[i - 1] * P;
//        }
//
//        while (m-- != 0) {
//            String[] cur = br.readLine().split(" ");
//            int l1 = Integer.parseInt(cur[0]);
//            int r1 = Integer.parseInt(cur[1]);
//            int l2 = Integer.parseInt(cur[2]);
//            int r2 = Integer.parseInt(cur[3]);
//            System.out.println(get(l1, r1) == get(l2, r2) ? "Yes" : "No");
//        }
//
//    }

}
