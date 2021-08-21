package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 836. 合并集合
 */
public class AC836 {

    private static final int N = 100010;
    private static int[] p = new int[N];

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
        }

        while (m-- != 0) {
            String op = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (op.equals("M")) {
                // a的祖宗节点的父亲等于b的祖宗节点
                p[find(a)] = find(b);
            } else if (op.equals("Q")){
                if (find(a) == find(b)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }

    }

}
