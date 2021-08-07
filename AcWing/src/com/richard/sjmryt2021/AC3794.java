package com.richard.sjmryt2021;



import java.util.Scanner;

/**
 * 3794. 构造字符串
 */
public class AC3794 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        for (int i=0; i<n; i++) {

            if (i%4 < 2) {
                System.out.print('a');
            } else {
                System.out.print('b');
            }

        }

    }

}
