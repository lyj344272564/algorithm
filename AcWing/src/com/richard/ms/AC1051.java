package com.richard.ms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AC1051 {

    static int T;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        while (T-- != 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            String[] cur = br.readLine().split(" ");
            for (int i=0; i<n; i++) {
                a[i] = Integer.parseInt(cur[i]);
            }
            int res = Integer.MIN_VALUE;
            int s = 0;
            for (int x : a) {
                if (s < 0) {
                    s = 0;
                }
                s += x;
                res = Math.max(res, s);
            }
            System.out.println(res);

        }

    }

}
