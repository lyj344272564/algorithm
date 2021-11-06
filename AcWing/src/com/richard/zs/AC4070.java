package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AC4070 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int max = a[0];
        String[] cur = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
            if (max<a[i]) {
                max = a[i];
            }
        }
        System.out.println(max^a[n-1]);

    }

}
