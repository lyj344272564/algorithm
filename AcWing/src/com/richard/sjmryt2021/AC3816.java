package com.richard.sjmryt2021;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 3816. 移动元素
 */
public class AC3816 {

    private static final int N = 100010;
    static int[] a = new int[N], b = new int[N];
    private static long[] s = new long[N];
    static int n;

    public static boolean check(int[] w) {
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + w[i];
        }

        if (s[n] % 2 == 1) {
            return false;
        }

        Set<Long> set = new HashSet<>();
        set.add(0L);
        for (int i = 1; i <= n; i++) {
            set.add((long)w[i]);
            if (set.contains(s[i] - s[n] / 2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            n = sc.nextInt();

            for (int i=1,j=n; i<=n; i++,j--) {

                a[i] = sc.nextInt();
                b[j] = a[i];

            }
            if (check(a) || check(b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
