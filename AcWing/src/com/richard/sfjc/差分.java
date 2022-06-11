package com.richard.sfjc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 在a[L,R]上加c
 * 就相当于在b[L]+=c   b[R+1]-=c  因为在L~R之间都加c，那么R之后的一个就要减去这个c
 */
public class 差分 {

    private static final int N = 100010;
    private static int[] a = new int[N];
    private static int[] b = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] val = bf.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);

        String[] cur = bf.readLine().split(" ");
        for (int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(cur[i-1]);
            insert(i,i,a[i]);
        }

        while (m-- != 0) {
            String[] cur1 = bf.readLine().split(" ");
            int l = Integer.parseInt(cur1[0]);
            int r = Integer.parseInt(cur1[1]);
            int c = Integer.parseInt(cur1[2]);

            insert(l,r,c);

        }

        for (int i=1; i<=n; i++) {
            b[i] += b[i-1];
        }

        for (int i=1; i<=n; i++) {
            System.out.print(b[i] + " ");
        }

    }

    private static void insert(int i, int j, int a) {
        b[i] += a;
        b[j+1] -= a;
    }

}
