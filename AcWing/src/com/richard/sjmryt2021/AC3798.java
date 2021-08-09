package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 *3798. 幸运年份
 */
public class AC3798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        while (T-- != 0) {

            int n = sc.nextInt();

            // 转化为string
            String s = "" + n;

            // 又是转化为int
            int x = s.charAt(0) - '0';

            // 最高位加1
            int y = x + 1;

            // 最高位的次方
            y = y * (int)Math.pow(10,s.length()-1);

            System.out.println(y-n);

        }
    }

}
