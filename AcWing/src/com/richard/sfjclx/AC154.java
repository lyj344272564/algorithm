package com.richard.sfjclx;

import java.io.*;

/**
 * 154. 滑动窗口
 * 队列
 */
public class AC154 {

    static final int N = 1000010;
    static int[] a = new int[N];
    static int[] q = new int[N];
    static int hh = 0;
    static int tt = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] val = br.readLine().split(" ");
        int n = Integer.parseInt(val[0]);
        int k = Integer.parseInt(val[1]);

        String[] cur = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
        }

        for (int i=0; i<n; i++) {

            if (hh<=tt && i-k+1>q[hh]) {
                hh++;
            }

            while (hh<=tt && a[q[tt]]>=a[i]) {
                tt--;
            }

            q[++tt] = i;
            if (i >= k-1) {
                bw.write(a[q[hh]] + " ");
            }

        }

        bw.write("\n");

        hh = 0;
        tt = -1;
        for (int i=0; i<n; i++) {

            if (hh<=tt && i-k+1>q[hh]) {
                hh++;
            }

            while (hh<=tt && a[q[tt]]<=a[i]) {
                tt--;
            }

            q[++tt] = i;
            if (i >= k-1) {
                bw.write(a[q[hh]] + " ");
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }








//    static final int N = (int) 1e6 + 100000;
//    // 存下标
//    static int[] a = new int[N];
//    static int[] q = new int[N];
//    static int hh = 0, tt = -1;
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] strs = reader.readLine().split(" ");
//        int n = Integer.parseInt(strs[0]);
//        int k = Integer.parseInt(strs[1]);
//
//        strs = reader.readLine().split(" ");
//        for(int i = 0; i < n; i++){
//            a[i] = Integer.parseInt(strs[i]);
//        }
//
//        for(int i = 0; i < n;i ++) {
//            // 控制窗口的滑动 i - k + 1 == 这个窗口的大小
//            if (hh <= tt && i - k + 1 > q[hh]) {
//                hh++;
//            }
//            // 判断大小使之成为单调序列
//            while (hh <= tt && a[q[tt]] >= a[i]) {
//                tt--;
//            }
//            q[++tt] = i;
//            // 从头开始遍历
//            if (i >= k - 1 ) {
//                writer.write(a[q[hh]] + " ");
//            }
//        }
//
//        writer.write("\n");
//
//        hh = 0;
//        tt = -1;
//        for(int i = 0; i < n;i ++) {
//            if (hh <= tt && i - k + 1 > q[hh]) {
//                hh++;
//            }
//            while (hh <= tt && a[q[tt]] <= a[i]) {
//                tt--;
//            }
//            q[++tt] = i;
//            if (i >= k - 1 )  {
//                writer.write(a[q[hh]] + " ");
//            }
//        }
//        writer.flush();
//        reader.close();
//        writer.close();
//
//    }

}
