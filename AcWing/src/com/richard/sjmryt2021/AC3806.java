package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3806. 最小化字符串
 */
public class AC3806 {

    private static final int N = 200010;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int idx = n;
            for (int i=1; i<n; i++) {
                if (s.charAt(i)<s.charAt(i-1)) {
                    idx = i;
                    break;
                }
            }
            System.out.println(s.substring(0,idx-1)+s.substring(idx,n));
        }


    }

}
