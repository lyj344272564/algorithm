package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 830. 单调栈
 */
public class AC830 {

    private static final int N = 100010;
    private static int[] stk = new int[N];
    private static int tt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] cur = br.readLine().split(" ");

        for (int i=0; i<n; i++) {

            int x = Integer.parseInt(cur[i]);

            while (tt!=0 && stk[tt] >= x) {
                tt--;
            }
            if (tt!=0) {
                System.out.print(stk[tt] + " ");
            } else {
                System.out.print("-1 ");
            }
            stk[++tt] = x;
        }

    }

}
