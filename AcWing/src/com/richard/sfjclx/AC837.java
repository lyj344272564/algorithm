package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *AcWing 837. 连通块中点的数量
 */
public class AC837 {

    private static final int N = 100010;
    private static int[] p = new int[N];
    private static int[] size = new int[N];

    // 返回x所在集合的编号  返回x的祖宗节点 + 路径压缩
    private static int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i=1; i<=n; i++) {
            p[i] = i;
            size[i] = 1;
        }

        while (m-- != 0) {

            String op = sc.next();

            if (op.equals("C")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                // 如果已经在一个集合中，则不需要任何判断了
                if (find(a) == find(b)) {
                    continue;
                }
                size[find(b)] += size[find(a)];
                // a的祖宗节点的父亲等于b的祖宗节点
                p[find(a)] = find(b);
            } else if (op.equals("Q")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (find(a) == find(b)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                int a = sc.nextInt();
                System.out.println(size[find(a)]);
            }
        }

    }

}
