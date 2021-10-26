package com.richard.sfjc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 归并排序模板 {

    private static int N =1000010;
    private static int[] temp = new int[N];


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] val = bf.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int[] a = new int[n];

        String[] cur = bf.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
        }

        merge_sort(a,0,n-1);

        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }

    }

    public static void merge_sort(int[] q, int l, int r) {


        if (l >= r) {
            return;
        }

        int mid = l + r >> 1;

        merge_sort(q,l,mid);
        merge_sort(q,mid+1,r);


        int k = 0;
        int i = l;
        int j = mid + 1;

        while (i<=mid && j<=r) {
            if (q[i]<=q[j]) {
                temp[k++] = q[i++];
            } else {
                temp[k++] = q[j++];
            }
        }

        while (i<=mid) {
            temp[k++] = q[i++];
        }
        while (j<=r) {
            temp[k++] = q[j++];
        }

        for (i=l,j=0; i<=r; i++,j++) {
             q[i] = temp[j];
        }

    }

}
