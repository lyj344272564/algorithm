package com.richard.sfjclx;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 786. 第k个数
 */
public class AC786 {

    private static final int N = 100010;


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str1 = reader.readLine().split(" ");

        int n = Integer.parseInt(str1[0]);
        int k = Integer.parseInt(str1[1]);
        int[] q = new int[n];
        String[] str2 = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(str2[i]);
        }

//       quick_sort(q,0,n-1);
        Arrays.sort(q);

        System.out.println(q[k - 1]);
//        System.out.println(quick_sort(0,n-1,k));
    }
}
