package com.richard.sfjc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 快速求出原数组中的一段和
 */
public class 前缀和 {

    private static int N = 100010;
    private static int[] a = new int[N];
    private static int[] s = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);

        String[] cur = br.readLine().split(" ");
        for (int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(cur[i-1]);
            s[i] = s[i-1] + a[i];
        }

        while (m-- != 0) {
            String[] cur1 = br.readLine().split(" ");
            int l = Integer.parseInt(cur1[0]);
            int r = Integer.parseInt(cur1[1]);
            System.out.println(s[r] - s[l-1]);
        }

    }

}
