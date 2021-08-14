package com.richard.zs;

import java.util.*;

/**
 * 3803. 数组去重
 */
public class AC3803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[1010];
            List<Integer> list = new ArrayList<>();

            for (int i=1; i<=n; i++) {
                a[i] = sc.nextInt();
                b[a[i]]++;
            }

            for (int i=1; i<=n; i++) {
                if(b[a[i]] == 1) {
                    list.add(a[i]);
                } else {
                    b[a[i]]--;
                }
            }

            System.out.println(list.size());

            for (Integer integer : list) {
                System.out.print(integer +" ");
            }
            System.out.println();

        }
    }
}
