package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 826. 单链表
 *  领接表 存储图和树
 */
public class AC826 {

    private static final int N = 100010;
    // 某个点的值是多少
    private static int[] e = new int[N];
    // 每个点的next值
    private static int[] ne = new int[N];
    private static int head = -1;
    // 存储当前已经用到了哪个点
    private static int idx = 0;

    // 将x插到头节点
    private static void add_to_head(int x) {
        // 存值
        e[idx] = x;
        ne[idx] = head;
        head = idx++;
    }

    // 将x插到下标为k的点后面
    private static void insert(int k, int x) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }
    // 将k点后面的点删掉
    private static void remove(int k) {
//        ne[k] = ne[++k];
        ne[k] = ne[ne[k]];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        while (M-- > 0) {
            String str = sc.next();
            if (str.equals("H")) {
                int x = sc.nextInt();
                add_to_head(x);
            } else if (str.equals("I")) {
                int k = sc.nextInt();
                int x = sc.nextInt();
                insert(k - 1, x);
            } else if (str.equals("D")) {
                int k = sc.nextInt();
                if (k == 0)
                    head = ne[head];
                else {
                    remove(k - 1);
                }
            }
        }

        int i = head;
        while (i != -1) {
            System.out.print(e[i] + " ");
            i = ne[i];
        }

    }

}
