package com.richard;

import java.util.Scanner;

/**
 *
 AcWing 3769. 移动石子
 */
public class AC3769 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt(); // 有多少个元素
            int d = sc.nextInt(); // 可以移几步

            int res = 0;

            for (int i=0; i<n; i++) {

                int x = sc.nextInt(); // 每一步输入的石子数

                if (i==0) {
                    res += x;
                } else {
                    int t = Math.min(x,d/i); // 最多是x步  最少是看距离和石子数共同决定  d/i  是此位置可以向第一个位置移动几个石子
                    res += t; // 第一个加上移动的石子数
                    d -= i*t; // 还可以移动多少个石子
                }
            }

            System.out.println(res);
        }

    }
}
