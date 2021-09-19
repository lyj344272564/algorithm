package com.richard.sfjclx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 853. 有边数限制的最短路
 */
public class AC853 {

    static int N = 510;
    static int M = 10010;
    // 定义一个类来存所有边
    static Edge[] edge = new Edge[M];
    // 距离
    static int[] dist = new int[N];
    static int[] back = new int[N];
    static int n,m,k;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            edge[i] = new Edge(a,b,c);
        }

        if (bellman_ford() > 0x3f3f3f>>1) {
            System.out.println("impossible");
        } else {
            System.out.println(bellman_ford());
        }
    }

    private static int bellman_ford() {

        Arrays.fill(dist,0x3f3f3f);

        dist[1] = 0;
        for (int i=0; i<k; i++) {
            // 上一次迭代的结果来copy  才不会发生串联
            back = dist.clone();
            for (int j=0; j<m; j++) {
                Edge e = edge[j];
                dist[e.b] = Math.min(dist[e.b], back[e.a]+e.c);
            }
        }

        return dist[n];
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
