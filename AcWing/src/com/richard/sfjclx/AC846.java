package com.richard.sfjclx;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 846. 树的重心
 */
public class AC846 {

    private static final int N = 100010;
    private static final int M = 2 * N;
    // n个链表的头
    private static int[] h = new int[N];
    // e边
    private static int[] e = new int[M];
    // ne next值
    private static int[] ne = new int[M];
    private static int idx;
    private static boolean[] st = new boolean[N];
    // 最小的最大值
    private static int ans = N;
    private static int n;
    private static int m;

    // 以u为根的子树的点的数量
    private static int dfs(int u) {
        // 标记一下，已经被搜过了
        st[u] = true;
        // 当前子树大小
        int sum = 1;
        // 每一个联通块的最小的最大值
        int res = 0;
        for (int i=h[u]; i!=-1; i=ne[i]) {
            int j = e[i];
            if (!st[j]) {
                // 当前子树大小
                int s = dfs(j);
                // 当前这个子树和res取max
                res = Math.max(res,s);
                // 当前这个子树也算子树
                sum += s;
            }
        }
        // 除了这个节点之外了所有节点
        res = Math.max(res,n-sum);
        // 最小值的最大值
        ans = Math.min(res,ans);
        return sum;
    }

    private static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 所有头结点指向-1
        Arrays.fill(h,-1);
        n = sc.nextInt();

        for (int i=0; i<n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a,b);
            add(b,a);
        }

        dfs(1);
        System.out.println(ans);

    }

}
