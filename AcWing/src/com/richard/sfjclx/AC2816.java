package com.richard.sfjclx;

import java.io.*;
import java.util.Scanner;

/**
 * AcWing 2816. 判断子序列
 */
public class AC2816 {

    private static final int N = 100010;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] val = br.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);
        int x = Integer.parseInt(val[2]);

        int[] a = new int[n];
        int[] b = new int[m];

        String[] curA = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(curA[i]);
        }

        String[] curB = br.readLine().split(" ");
        for (int i=0; i<m; i++) {
            b[i] = Integer.parseInt(curB[i]);
        }

        int i=0;
        for (int j=0; j<m; j++) {
            if (a[i] == b[j] && i<n) {
                i++;
            }
        }
        if (i==n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }

}
