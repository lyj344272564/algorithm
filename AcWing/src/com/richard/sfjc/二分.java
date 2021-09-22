package com.richard.sfjc;

import java.util.Scanner;

public class 二分 {

    private static int N = 100010;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        while (q-- != 0) {

            int x = sc.nextInt();

            int l = 0;
            int r = n-1;

            while (l < r) {
                int mid = l + r >>1;
                if (a[mid] >= x) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (a[l] != x) {
                System.out.println("-1 -1");
            } else {
                System.out.print(l+" ");
                l = 0;
                r = n-1;

                while (l < r) {
                    int mid = l+r+1>>1;
                    if (a[mid]<=x) {
                        l = mid;
                    } else {
                        r = mid-1;
                    }
                }
                System.out.print(l);
                System.out.println();
            }

        }

    }

}
