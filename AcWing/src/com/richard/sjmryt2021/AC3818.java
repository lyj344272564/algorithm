package com.richard.sjmryt2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3818. 餐厅
 */
public class AC3818 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] orders = new int[n][2];

        for (int i=0; i<n; i++) {
            String[] values = br.readLine().split(" ");
            orders[i][0] = Integer.parseInt(values[0]);
            orders[i][1] = Integer.parseInt(values[1]);
        }

        // 按右端点排序
        Arrays.sort(orders, (a, b) -> (a[1] - b[1]));

        int res = 0;
        // 上一个选择区间的右端点
        int last = 0;

        for (int i=0; i<n; i++) {
            // 如果当前区间的左端点大于上一个选择区间的右端点（无重叠）
            if (orders[i][0] > last) {
                res++;
                last = orders[i][1];
            }
        }
        System.out.println(res);
        br.close();
    }

}
