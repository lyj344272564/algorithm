package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 799. 最长连续不重复子序列
 * 双指针
 */
public class AC799 {

    private static final int N = 100010;
    private static int[] a = new int[N];
    private static int[] s = new int[N];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i=0,j=0; i<n; i++) {
           s[a[i]] ++;
           // 新加的数据有重复  那么这个重复的数据一定为a[i]
            while (s[a[i]] > 1) {
                // 最前面的数量减一
                s[a[j]] --;
                // 后移
                j++;
            }
            res = Math.max(res,i-j+1);
        }

        System.out.println(res);

    }

}
