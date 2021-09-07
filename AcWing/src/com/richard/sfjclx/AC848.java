package com.richard.sfjclx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 848. 有向图的拓扑序列
 */
public class AC848 {

    private static final int N = 100010;
    private static int[] h = new int[N];
    private static int[] e = new int[N];
    private static int[] ne = new int[N];
    private static int idx;
    private static int[] q = new int[N];//BFS队列
    //有向图的入度
    private static int[] d = new int[N];

    private static int n;
    private static int m;

    private static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    private static boolean topsort() {

        int hh = 0;
        int tt = -1;

        //将入度为0的结点全部加入进队列中作为起始结点
        for (int i=1; i<=n; i++) {
            // 插入入度为0的点
            if (d[i]==0) {
                q[++tt] = i;
            }
        }

        while (hh<=tt) {
            int t = q[hh++];
            for (int i=h[t]; i!=-1; i = ne[i]) {
                int j = e[i];
                d[j]--;
                if (d[j] == 0) {
                    q[++tt] = j;
                }
            }
        }
        return tt==n-1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        Arrays.fill(h,-1);

        for (int i=0; i<m; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a,b);
            d[b]++;//a->b：b的入度+1
        }

        if(topsort()){
            for(int i=0; i<n; i++){
                System.out.print(q[i] + " ");
            }
        }else{
            System.out.println(-1);
        }

    }

}
