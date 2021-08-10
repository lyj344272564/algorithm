package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * AcWing 3799. 送糖果
 */
public class AC3799 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int k = 1;

            while (true) {
                if (a < k) {
                    System.out.println("Vladik");
                    break;
                }
                a -= k++;
                if (b < k) {
                    System.out.println("Valera");
                    break;
                }
                b -= k++;

            }
        }

    }

}
