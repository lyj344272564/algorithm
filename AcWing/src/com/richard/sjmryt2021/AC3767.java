package com.richard.sjmryt2021;


import java.util.Scanner;

/**
 *
 AcWing 3767. 最小的值
 */
public class AC3767 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        int x = 0;
        int y = 0;
        for (int i=0; i<n; i++) {
            if (a[i] < b[i]) {
                x++;
            } else if (a[i] > b[i]) {
                y++;
            }

        }
        if (y == 0) {
            System.out.println("-1");
        } else {
            System.out.println((x+y)/y);
        }
    }
}
