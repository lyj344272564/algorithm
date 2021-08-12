package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3801. 最佳连续子数组
 */
public class AC3801 {

    private static final int N = 100010;
    private static int[] a = new int[N];


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();

            int max = 0;

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max,a[i]);
            }


            int res = 0;

            // 双指针
            for (int i=0; i<n; i++) {
                // 如果此时 是最大值那么从此是开始判断后面的元素
                if (a[i] == max) {
                    // 之后一个元素
                    int j = i+1;
                    //之后一个元素是否是最大值的一个循环
                    while (j<n && a[j] == max) {
                        j++;
                    }
                    // 此时更新最大值
                    res = Math.max(res, j-i);
                    // 当时第一次看到这步有点懵逼，后来才想出来这步原来是
                    // 这步之后还会执行i++ 所以这步是为了跳过之前判断过的a数组
                    i = j - 1;
                }
            }

            System.out.println(res);


        }
    }

}
