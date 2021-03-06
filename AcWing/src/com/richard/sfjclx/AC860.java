package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 860. 染色法判定二分图
 */
public class AC860 {

    static int n,m;
    static final int N = 100010;
    static final int M = 200010;

    static int[] h = new int[N];
    static int[] e = new int[M];
    static int[] ne = new int[M];
    static int idx;

    static int[] color = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        Arrays.fill(h,-1);

        while (m-- != 0) {
            String[] cur = br.readLine().split(" ");
            int a = Integer.parseInt(cur[0]);
            int b = Integer.parseInt(cur[1]);
            add(a,b);
            add(b,a);
        }

        boolean flag = true;
        // n个点进行染色
        for (int i=1; i<=n; i++) {
            if (color[i]==0) {
                // 第一个染1   然后用3-c巧妙的实现了一二交换 如果染色失败了 泽执行if里面的
                if (!dfs(i,1)) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static boolean dfs(int u, int c) {
        // 从第一次这样染色
        color[u] = c;
        for (int i=h[u]; i!=-1; i=ne[i]) {
            int j = e[i];
            // 还没有呗染色
            if (color[j] == 0) {
                if (!dfs(j,3-c)) {
                    return false;
                }
            } else { // 如果已经染色 此时判断颜色是否相等
                if (color[j] == c) {
                    return false;
                }
            }
        }
        return true;
    }


    static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

}
