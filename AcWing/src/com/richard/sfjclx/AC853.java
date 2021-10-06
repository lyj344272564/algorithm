package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 853. 有边数限制的最短路
 */
public class AC853 {

    static int N = 510;
    static int M = 100010;
    static Edge[] edge = new Edge[M];
    static int[] dist = new int[N];
    static int[] back = new int[N];
    static int n,m,k;
    static final int max = 0x3f3f3f;

    static int bellman_ford() {
        Arrays.fill(dist,0x3f3f3f);
        dist[1] = 0;
        for (int i=0; i<k; i++) {
            // 只用上一次迭代的结果来copy  才不会发生串联
            back = dist.clone();
            for (int j=0; j<m; j++) {
                Edge e = edge[j];
                dist[e.b] = Math.min(dist[e.b], back[e.a]+e.c);
            }
        }
        return dist[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val  = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);
        k = Integer.parseInt(val[2]);

        for (int i=0; i<m; i++) {
            String[] cur = br.readLine().split(" ");
            int a = Integer.parseInt(cur[0]);
            int b = Integer.parseInt(cur[1]);
            int c = Integer.parseInt(cur[2]);
            edge[i] = new Edge(a,b,c);
        }

        if (bellman_ford() > (0x3f3f3f>>1)) {
            System.out.println("impossible");
        } else {
            System.out.println(dist[n]);
        }

    }

}

class Edge{
    int a;
    int b;
    int c;

    public Edge() {
    }

    public Edge(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
