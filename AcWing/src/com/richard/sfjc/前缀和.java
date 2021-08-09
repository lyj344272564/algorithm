package com.richard.sfjc;


import java.util.Scanner;

public class 前缀和 {

    private static int N = 100010;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[N];
        int[] s = new int[N];


//        for (int i=1; i<=n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        // 前缀和初始化
//        for (int i=1; i<=n; i++) {
//            s[i] = s[i-1] + a[i];
//        }

        //优化
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
            s[i] = s[i-1] + a[i];
        }

        while (m-- != 0) {

            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(s[r]-s[l-1]);
        }


    }

}
