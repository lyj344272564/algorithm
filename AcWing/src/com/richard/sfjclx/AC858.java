package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 858. Prim算法求最小生成树
 */
public class AC858 {

    static int N = 510;
    // 稠密图用邻接矩阵存储
    static int[][] g = new int[N][N];
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];
    static int max = (int)1e9;
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = in.readLine().split(" ");
        n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        for(int i=1;i<=n;i++) {
            Arrays.fill(g[i],0x3f3f3f3f);
        }

        while(m-->0){
            String[] cur = in.readLine().split(" ");
            int u = Integer.parseInt(cur[0]);
            int v = Integer.parseInt(cur[1]);
            int w = Integer.parseInt(cur[2]);

            g[u][v] = g[v][u] = Math.min(g[u][v],w);

        }

        int t = prim();

        if(t==-1) {
            System.out.println("impossible");
        } else {
            System.out.println(t);
        }

    }

    static int prim() {
        Arrays.fill(dist,max);
        int res = 0;

        for (int i=0; i<n; i++) {
            int t = -1;
            for (int j=1; j<=n; j++) {
                if ((t==-1 || dist[t]>dist[j]) && !st[j]) {
                    t = j;
                }
            }

            if (i!=0 && dist[t]==max) {
                return -1;
            }

            st[t] = true;
            if (i > 0) {
                res += dist[t];
            }

            for (int j=1; j<=n; j++) {
                dist[j] = Math.min(dist[j], g[t][j]);
            }

        }

        return res;
    }

//    static int prime() {
//
//        Arrays.fill(dist,max);//初始化所有点到集合的距离都为正无穷
//        int res = 0;//用于记录最小生成树的权值
//
//        for (int i=0; i<n; i++) {
//            //找到距离集合最近的那个点(不在集合当中的)
//            int t = -1;
//            for (int j=1; j<=n; j++) {
//                if ((t==-1||dist[t]>dist[j]) && !st[j]) {
//                    t = j;
//                }
//            }
//
//            //如果此时不是寻找的第一个点，但是所有点到集合的距离最小值为正无穷，说明不存在最小生成树
//            if (i>0 && dist[t] == max) {
//                return -1;
//            }
//
//            if (i > 0) {
//                res += dist[t];
//            }
//            // t加到距离最近的点中去
//            st[t] = true;
//
//            //用新加进来的点去更新其它点到集合的距离
//            for (int j=1; j<=n; j++) {
//                dist[j] = Math.min(dist[j], g[t][j]);
//            }
//        }
//        return res;
//    }

}
