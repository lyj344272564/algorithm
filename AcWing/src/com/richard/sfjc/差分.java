package com.richard.sfjc;


import java.util.Scanner;

/**
 * 在a[L,R]上加c
 * 就相当于在b[L]+=c   b[R+1]-=c  因为在L~R之间都加c，那么R之后的一个就要减去这个c
 */
public class 差分 {

    private static final int N = 100010;
    private static int[] a = new int[N];
    private static int[] b = new int[N];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

//        for (int i=1; i<=n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i=1; i<=n; i++) {
//            insert(i,i,a[i]); // 初始化b序列
//        }

        // 优化
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
            insert(i,i,a[i]); // 初始化b序列
        }


        while (m-- != 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            insert(l,r,c);
        }

        // 求a[i]
        for (int i=1; i<=n; i++) {
            b[i] += b[i-1];
        }

        for (int i=1; i<=n; i++) {
            System.out.print(b[i] + " ");
        }

    }

    public static void insert(int l, int r, int c) {
        b[l] += c;
        b[r+1] -= c;
    }

}
