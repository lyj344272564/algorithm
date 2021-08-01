package com.richard;



import java.util.Scanner;

public class AC3773 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            boolean flag = false;// 判断是否和x有相等

            int a = 0;

            while (n-- != 0) {
                int t = sc.nextInt();

                if (t == x) {
                    flag = true;
                }
                a = Math.max(t, a);

            }

            if (flag) {
                System.out.println(1);
            } else if (a>x){
                System.out.println(2);
            } else {
                System.out.println((x+a-1)/a); // 向上取整 最后只剩的一点距离，向上取整  画图为准
            }

        }

    }

}
