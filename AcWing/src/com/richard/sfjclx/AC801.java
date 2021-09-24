package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * AcWing 801. 二进制中1的个数
 * 位运算~x+1 = -x 反码等于补码加一
 */
public class AC801 {


    // 求x里面最后一个1的位置
    private static int lowbit(int x) {
        return x & -x;
    }

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       String[] cur = br.readLine().split(" ");

       int i=0;

        while (n-- != 0) {

            int x = Integer.parseInt(cur[i++]);

            int res = 0;

            while (x != 0) {
                // 每次减去最后一个1 减多少次就是有多少个1
                x -= lowbit(x);
                res++;
            }

            System.out.print(res + " ");

        }

    }

}
