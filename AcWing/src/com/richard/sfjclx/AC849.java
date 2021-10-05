package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Dijkstra求最短路 I
 */
public class AC849 {

    static int N = 510;
    static int[][] g = new int[N][N];
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];
    static int n;
    static final int max = 5000000;

    static int dijkstra() {

        // 初始化
        Arrays.fill(dist,max);
        dist[1] = 0;

        for (int i=0; i<n; i++) {

            int t =  -1;
            // 寻找最小
            for (int j=1; j<=n; j++) {
                // 当前这个点还没有确定最短路
                if (st[j]) {
                    continue;
                }
                // t不是最短的
                if (t==-1 || dist[t]>dist[j]) {
                    t = j;
                }
            }
            // 把t加入最短
            st[t] = true;
            // 更新
            for (int j=1; j<=n; j++) {
                if (dist[j] > dist[t] + g[t][j]) {
                    dist[j] = dist[t] + g[t][j];
                }
            }

        }

        if (dist[n] == max) {
            return -1;
        } else {
            return dist[n];
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);

        for (int i=0; i<n; i++) {
            Arrays.fill(g[i],max);
        }

        while (m-- != 0) {
            String[] cur = br.readLine().split(" ");
            int a = Integer.parseInt(cur[0]);
            int b = Integer.parseInt(cur[1]);
            int c = Integer.parseInt(cur[2]);
            g[a][b] = Math.min(g[a][b], c);
        }

        System.out.println(dijkstra());

    }

}
