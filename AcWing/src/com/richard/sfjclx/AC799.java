package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 799. 最长连续不重复子序列
 * 双指针
 */
public class AC799 {

    private static final int N = 100010;
    private static int[] a = new int[N];
    private static int[] s = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] val = br.readLine().split(" ");
//        int n = Integer.parseInt(val[0]);
        int n = Integer.parseInt(br.readLine());
        int res = 0;

        String[] cur = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
        }

        for (int i=0,j=0; i<n; i++) {
            s[a[i]]++;
            // 每次抛弃其前面的直到不重复为止
            while (s[a[i]] > 1) {

                s[a[j]]--;
                // 后移
                j++;
            }
            res = Math.max(res, i-j+1);
        }
        System.out.println(res);
    }
}
