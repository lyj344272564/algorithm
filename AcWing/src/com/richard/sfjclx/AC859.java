package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 859. Kruskal算法求最小生成树
 * 稀疏图
 */
public class AC859 {

    static final int N = 100010;
    static int[] p = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");
        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);

        for (int i=1; i<=n; i++) {
            p[i] = i;
        }

        Edge[] edge = new Edge[m];

        for (int i=0; i<m; i++) {
            String[] cur = br.readLine().split(" ");
            int a = Integer.parseInt(cur[0]);
            int b = Integer.parseInt(cur[1]);
            int c = Integer.parseInt(cur[2]);
            edge[i] = new Edge(a,b,c);
        }

        Arrays.sort(edge, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.c- o2.c;
            }
        });

        int cnt = 0;
        int res = 0;

        for (int i=0; i<m; i++) {
            Edge temp = edge[i];
            int a = temp.a;
            int b = temp.b;
            int c = temp.c;
            a = find(a);
            b = find(b);
            if (a != b) {
                p[a] = b;
                res += c;
                cnt++;
            }
        }
        if (cnt == n-1) {
            System.out.println(res);
        } else {
            System.out.println("impossible");
        }

    }

    static int find(int x) {
        if (x!=p[x]) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

//    static int n;
//    static int m;
//    static final int N = 100010;
//    static final int M = 200010;
//    // 并查集里的数组
//    static int[] p = new int[N];
//    static Edge[] e = new Edge[M];
//
//        static int N = 100010;
//        // 并查集里面的数组
//        static int[] p = new int[N];
//
//        public static void main(String[]args) throws IOException {
//            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//            String[] cur = in.readLine().split(" ");
//            int n = Integer.parseInt(cur[0]);
//            int m = Integer.parseInt(cur[1]);
//
//            // 初始化并查集
//            for(int i=1; i<=n; i++) {
//                p[i] = i;
//            }
//
//            Edge[] g = new Edge[m];
//
//            for(int i=0; i<m; i++){
//                String[] arr = in.readLine().split(" ");
//                int a = Integer.parseInt(arr[0]);
//                int b = Integer.parseInt(arr[1]);
//                int c = Integer.parseInt(arr[2]);
//
//                g[i] = new Edge(a, b, c);
//            }
//
//            Arrays.sort(g, new Comparator<Edge>(){
//                @Override
//                public int compare(Edge e1, Edge e2){
//                    return e1.c - e2.c;
//                }
//            });
//
//            // 当前加入多少条边
//            int cnt = 0;
//            // 最小生成树中的所有权重之和
//            int res = 0;
//            // 枚举每条边
//            for(int i=0; i<m; i++){
//                Edge tmp = g[i];
//                int a = tmp.a;
//                int b = tmp.b;
//                int c = tmp.c;
//                a = find(a);
//                b = find(b);
//                if(a!=b){
//                    p[a] = b;
//                    res += c;
//                    cnt++;
//                }
//            }
//
//            if(cnt == n-1){
//                System.out.println(res);
//            }else {
//                System.out.println("impossible");
//            }
//        }
//
//    static int find(int x){s
//        if(x!=p[x]){
//            p[x] = find(p[x]);
//        }
//        return p[x];
//    }

}
