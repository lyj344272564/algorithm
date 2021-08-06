package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * 3791. 解码
 * 模拟的过程已经就是一个往前一个往后
 */
public class AC3791 {

    private static String inster(char c, String res) {

        int length = res.length();

        int index = length/2;

        return res.substring(0,index) + c + res.substring(index,length);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        String res = "";

        for (int i=n-1; i>=0; i--) {
            res = inster(s.charAt(i),res);
        }
        System.out.println(res);

    }

}
