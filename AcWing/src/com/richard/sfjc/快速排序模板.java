package com.richard.sfjc;

import java.io.IOException;
import java.util.Scanner;

public class 快速排序模板 {

    public static void main(String[] args) throws IOException {


        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        quick_start(a,0,n-1);

        for(int i=0; i<n; i++) {
            System.out.print(a[i]+" ");
        }

    }

   static void quick_start(int q[], int l, int r) {
     if (l>=r) return;
     int x = q[l];
     int i = l - 1;
     int j = r + 1;
     while (i < j) {
         do {
             i++;
         } while (q[i] < x);
         do {
             j--;
         } while (q[j] > x);
         if (i<j) {
             int temp = q[i];
             q[i] = q[j];
             q[j] = temp;
         }
     }
     quick_start(q,l,j);
     quick_start(q,j+1,r);
   }
}
