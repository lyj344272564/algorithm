package com.richard.sfjc;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 二分 {

    private static int N = 100010;

    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int q = sc.nextInt();
//
//        int[] a = new int[n];
//
//        for (int i=0; i<n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        while (q-- != 0) {
//
//            int x = sc.nextInt();
//
//            int l = 0;
//            int r = n-1;
//
//            while (l < r) {
//                int mid = l + r >>1;
//                // 从左往右看第一个满足大于等于x的数字
//                if (a[mid] >= x) {
//                    r = mid;
//                } else {
//                    l = mid + 1;
//                }
//            }
//            // 不存在x这个值，直接输出
//            if (a[l] != x) {
//                System.out.println("-1 -1");
//            } else {
//                System.out.print(l+" ");
//                l = 0;
//                r = n-1;
//
//                while (l < r) {
//                    int mid = l + r + 1 >> 1;
//                    if (a[mid]<=x) {
//                        l = mid;
//                    } else {
//                        r = mid - 1;
//                    }
//                }
//                System.out.print(l);
//                System.out.println();
//            }
//
//        }

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] val = bf.readLine().split(" ");
        int n = Integer.parseInt(val[0]);
        int q = Integer.parseInt(val[1]);

        int[] a = new int[n];

        String[] cur = bf.readLine().split(" ");

        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
        }
        while (q-- != 0) {

            String[] b = bf.readLine().split(" ");
            int x = Integer.parseInt(b[0]);

            int l = 0;
            int r = n - 1;

            while (l < r) {

                int mid = l + r >> 1;

                if (a[mid] >= x) {
                    r = mid;
                } else {
                    l = mid + 1;
                }

            }
            if (a[l] != x) {
                System.out.println("-1 -1");
            } else {
                System.out.print(l + " ");
                l = 0;
                r = n - 1;

                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    // 此处 l = mid 如果上面mid = l+r >> 1的话，那么下面的l = mid就有可能成为l = l发生死循环
                    if (a[mid] <= x) {
                        l = mid;
                    } else {
                        r = mid - 1;
                    }
                }
                System.out.print(l);
                System.out.println();
            }



        }
    }

}
