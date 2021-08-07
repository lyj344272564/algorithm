package com.richard.sfjc;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.Scanner;

public class 归并排序模板 {

    private static int N =1000010;
    private static int[] temp = new int[N];


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }

        merge_sort(a,0,n-1);

        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }

    }

    public static void merge_sort(int[] q, int l, int r) {

        // 只有一个或者没有就不需要排序了
        if (l>=r) {
            return;
        }

        int mid = l + r>>1;

        // 左边
        merge_sort(q,l,mid);
        merge_sort(q,mid+1,r);

        int k = 0;
        int i = l;
        int j = mid+1;


        while (i <= mid && j<=r) {
            if (q[i] <= q[j]) {
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
