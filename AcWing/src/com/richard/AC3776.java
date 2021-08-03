package com.richard;

import javafx.scene.AmbientLight;

import java.util.Scanner;

public class AC3776 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int a = sc.nextInt(); // 苹果
            int b = sc.nextInt(); // 梨
            int c = sc.nextInt(); // 橙子
            int d = sc.nextInt(); // 香蕉
            int e = sc.nextInt(); // 方案一
            int f = sc.nextInt(); // 方案二

            int ret = 0;

            if (e>=f) {
                int x = Math.min(a,d);
                d = d-x;
                int y = Math.min(Math.min(b,c),d);
                ret = x*e + y*f;
            } else {
                int x = Math.min(Math.min(b,c),d);
                d -= x;
                int y = Math.min(a,d);
                ret = x*f + y*e;
            }

            System.out.println(ret);

        }
    }
}
