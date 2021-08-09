package com.richard.sfjclx;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 786. 第k个数
 */
public class AC786 {

    private static final int N = 100010;
    private static int[] q = new int[N];

    public static void main(String[] args) throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String[] str1 = reader.readLine().split(" ");

       int n = Integer.parseInt(str1[0]);
       int k = Integer.parseInt(str1[1]);

       String[] str2 = reader.readLine().split(" ");
       for (int i=0; i<n; i++) {
           q[i] = Integer.parseInt(str2[i]);
       }

       quick_sort(q,0,n-1);

       System.out.println(q[k-1]);
        System.out.println(quick_sort(0,n-1,k));
    }

    private static void quick_sort(int[] q, int l, int r) {
        if (l >= r) {
            return;
        }

        int x = q[l+r >> 1];
        int i = l - 1;
        int j = r + 1;

        while (i < j) {
            while (q[++i]<x);
            while (q[--j]>x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quick_sort(q,l,j);
        quick_sort(q,j+1,r);

    }
    private static int quick_sort(int l, int r,int k) {
        if (l >= r) {
            return  q[l];
        }
        int x = q[l+r >> 1];
        int i = l - 1;
        int j = r + 1;

        while (i < j) {
            while (q[++i]<x);
            while (q[--j]>x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        int sl = j - l + 1;
        if (sl >= k){
            return quick_sort(l, j, k);
        } else {
            return quick_sort(j+1, r, k);
        }

    }

}
