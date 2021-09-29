package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 840. 模拟散列表
 * 拉链
 */
public class AC840 {

    private static final int N = 100003; // 质数
    private static final int N2 = 200003;
    private static final int null1 = 0x3f3f3f3f;
    private static int[] h = new int[N];
    private static int[] e = new int[N];
    private static int[] ne = new int[N];
    private static int idx = 0;


    private static void insert(int x) {
        // k 哈希值
        int k = (x % N + N) % N;
        e[idx] = x;
        ne[idx] = h[k];
        h[k] = idx++;

    }

    // 拉链法
    private static boolean find(int x) {
        int k = (x % N + N) % N;

        for (int i=h[k]; i!=-1; i=ne[i]) {
            if (e[i] == x) {
                return true;
            }
        }
        return false;

    }

    // 开放寻址
    private static int find2(int x) {
        int k = (x%N2 + N2) % N2;
        while (h[k] != null1 && h[k] != x) {
            k++;
            if (k==N2) {
                k = 0;
            }
        }
        return k;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 拉链
        Arrays.fill(h,-1);
        // 开放寻址
//        Arrays.fill(h,0x3f);

        while (n-- != 0) {
            String[] cur = br.readLine().split(" ");
//
//            if (cur[0].equals("I")) {
//                int x = Integer.parseInt(cur[1]);
//                int k = find2(x);
//                h[k] = x;
//            } else if (cur[0].equals("Q")) {
//                int x = Integer.parseInt(cur[1]);
//                int k = find2(x);
//                h[k] = x;
//                if (h[k] != null1) {
//                    System.out.println("Yes");
//                } else {
//                    System.out.println("No");
//                }
//            }

            if (cur[0].equals("I")) {
                int x = Integer.parseInt(cur[1]);
                insert(x);
            } else if (cur[0].equals("Q")) {
                int x = Integer.parseInt(cur[1]);
                if (find(x)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }

    }

}
