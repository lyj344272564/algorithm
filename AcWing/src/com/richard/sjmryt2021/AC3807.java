package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3807. 构造字符串
 */
public class AC3807 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int time = n/k;
            int r = n%k;
            StringBuilder res = new StringBuilder();
            // 每个区间的字母不同，相同区间的字母相同
            for (int i=0; i<k-1; i++) {
                for (int j=0;j<time; j++) {
                    res.append((char)('a'+i));
                }
            }
            // 最后一个区间
            for (int i=0; i<time+r; i++) {
                res.append((char)('a' + k - 1));
            }
            System.out.println(res.toString());

        }

    }

}
