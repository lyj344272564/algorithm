package com.richard.sfjclx;

import java.util.Scanner;

/**
 * 835. Trie字符串统计
 */
public class AC835 {

    private static final int N = 100010;
    // 每个点的所有儿子
    private static int[][] son = new int[N][26];
    // 以当前这个点结尾的有多少个
    private static int[] cnt = new int[N];
    // 当前用到的是哪个下标
    // 下标是0即使根节点，又是空节点
    private static int idx = 0;

    private static void insert(char srt[]) {
        int p=0;
        for (int i=0; i<srt.length; i++) {
            int u = srt[i] - 'a';
            if (son[p][u] == 0) {
                son[p][u]  = ++idx;
            }
            p = son[p][u];
        }
        // 以这个点结尾的单词数量多了一个
        cnt[p]++;
    }

    private static int query(char srt[]) {
        int p=0;
        for (int i=0; i< srt.length; i++) {
            int u = srt[i] - 'a';
            if (son[p][u] == 0) {
                return 0;
            }
            p = son[p][u];
        }
        return cnt[p];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N-- != 0) {

            String op = sc.next();

            if (op.equals("I")) {
                String str = sc.next();
                char[] s = str.toCharArray();
                insert(s);
            } else {
                String str = sc.next();
                char[] s = str.toCharArray();
                System.out.println(query(s));
            }

        }

    }

}
