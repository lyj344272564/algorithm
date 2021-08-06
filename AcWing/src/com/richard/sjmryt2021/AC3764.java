package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * AcWing 3764. 三元数异或
 */
public class AC3764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();

            String s = sc.next();

            char[] ss = s.toCharArray();

            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();

            boolean flag = false;

            for (char c : ss) {
                if (c == '0') {
                    a.append('0');
                    b.append('0');
                } else if (c == '1') {
                    if (flag) {
                        a.append('0');
                        b.append('1');
                    } else {
                        a.append('1');
                        b.append('0');
                        flag = true;
                    }
                } else if (c == '2'){
                    if (flag) {
                        a.append('0');
                        b.append('2');
                    } else {
                        a.append('1');
                        b.append('1');
                    }
                }
            } // for
            System.out.println(a.toString());
            System.out.println(b.toString());
        } // while

    } // main
}
