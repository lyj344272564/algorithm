package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Dijkstra求最短路 I
 */
public class AC849 {

    static int N = 510;
    static int[][] g = new int[N][N]; //稠密图使用邻接矩阵存储
    // 当前的最短距离
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N]; //相当于s集合，确定了和1号点的最短距离的点加入到s集合中
    static int n;
    static int max = 5000000;

    private static int dijkstra() {
        //初始化
        Arrays.fill(dist, max);
        dist[1] = 0;
        for (int i=0; i<n; i++) {
            int t = -1;
            for (int j=1; j<=n; j++) {
                if(st[j]) {
                    continue;
                }
                if(t==-1||dist[j]<dist[t]){
                    t = j;
                }
            }
            st[t] = true;
            //更新其它节点到1号点的距离
            for(int j=1; j<=n; j++) {
                if(dist[j] > dist[t] + g[t][j]) {
                    dist[j] = dist[t]+g[t][j];
                }
            }
        }

        if(dist[n]==max) {
            return -1;
        } else {
            return dist[n];
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] cur = in.readLine().split(" ");
        n = Integer.parseInt(cur[0]);
        int m = Integer.parseInt(cur[1]);

        //初始化g为正无穷，解决重边的问题
        for(int i=1; i<=n; i++) {
            Arrays.fill(g[i], max);
        }

        while(m-->0){
            String[] arr = in.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            // a、b之间有多条边   我们只需要保存最短的就可以了
            g[a][b] = Math.min(g[a][b], c);
        }

        System.out.println(dijkstra());

    }

}
