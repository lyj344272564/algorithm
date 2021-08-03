package com.richard;

import java.util.Scanner;

/**
 *
 AcWing 3774. 亮灯时长
 */
public class AC3774 {

    private static int N = 100010;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] a = new int[N];
        int[] s1 = new int[N]; // 奇数
        int[] s2 = new int[N]; // 偶数

        while (T-- != 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int i=1; i<=n; i++) a[i] = sc.nextInt(); // 0  n看做end

            a[++n] = m;

            s1[n] = s2[n] = 0;


            for (int i=n-1; i>=0; i--) {
                s1[i] = s1[i+1];
                s2[i] = s2[i+1];

                if (i%2 == 0) {
                    s1[i] += a[i+1] - a[i]; // 奇数区间和
                } else {
                    s2[i] += a[i+1] - a[i]; // 偶数区间和
                }
            }

            int res = s1[0];

            for (int i=0; i<n; i++) {
                int t = a[i+1] - a[i];
                if (t == 1) continue;
                res = Math.max(res,s1[0]-s1[i]+s2[i+1]+t-1); // 前i个奇数  和   后i+1个偶数
            }

            System.out.println(res);

        }
    }
}
