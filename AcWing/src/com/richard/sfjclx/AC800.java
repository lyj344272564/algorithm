package com.richard.sfjclx;


import java.util.Scanner;

/**
 * 800. 数组元素的目标和
 */
public class AC800 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for (int j=0; j<m; j++) {
            b[j] = sc.nextInt();
        }

        for (int i=0,j=m-1; i<n; i++) {
            // 这里j 不能=0 里面一减就是-1此时就会越界
           while (j>0 && (x < a[i] + b[j])) {
               j--;
           }
           if (j>=0 && a[i]+b[j] == x) {
               System.out.println(i+" "+j);
           }
        }


    }

}
