package com.richard.sfjclx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 840. 模拟散列表
 * 拉链
 */
public class AC840 {

    private static final int N = 100003;
    private static final int N2 = 0x3f3f3f;
    private static int[] h = new int[N];
    private static int[] e = new int[N];
    private static int[] ne = new int[N];
    private static int idx = 0;


    private static void insert(int x) {
        // k 哈希值
        int k = (x%N + N) % N;
        e[idx] = x;
        ne[idx] = h[k];
        h[k] = idx++;

    }

    private static boolean find(int x) {
        int k = (x%N + N) % N;

        for (int i=h[k]; i!=-1; i = ne[i]) {
            if (e[i] == x) {
                return true;
            }
        }
        return false;

    }

    private static int find2(int x) {
        int k = (x%N + N) % N;
        while (h[N2] != 0 && h[k] != x) {
            k++;
            if (k==N2) {
                k = 0;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 拉链
//        Arrays.fill(h,-1);
        // 开放寻址
        Arrays.fill(h,0x3f);

        while (n-- != 0) {
            String op = sc.next();

            if (op.equals("I")) {
                int x = sc.nextInt();
                insert(x);
            } else if (op.equals("Q")) {
                int x = sc.nextInt();
                if (find(x)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }

    }

}
