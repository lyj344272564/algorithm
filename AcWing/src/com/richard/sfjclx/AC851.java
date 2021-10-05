package com.richard.sfjclx;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 851. spfa求最短路
 */
public class AC851 {

    static final int N = 100010;
    static int[] h = new int[N];
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] w = new int[N];
    static int idx;
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];
    static final int max = (int)1e9;
    static int n,m;


    static void add(int a, int b, int c) {
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    static int spfa() {
        Arrays.fill(dist,max);
        dist[1] = 0;
        st[1] = true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);

        while (!q.isEmpty()) {
            // 出队
            int cur = q.poll();
            st[cur] = false;

            // 从邻接表头开始遍历
            for (int i=h[cur]; i!=-1; i=ne[i]) {
                int j = e[i];
                //如果当前节点可以被更新，就做更新操作，并将该节点加入到队列中
                if (dist[j] > dist[cur] + w[i]) {
                    dist[j] = dist[cur] + w[i];
                    if (!st[j]) {
                        q.add(j);
                        st[j] = true;
                    }
                }
            }
        }

        return dist[n];
    }

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
            int c = Integer.parseInt(cur[2]);
            add(a,b,c);
        }

        int t = spfa();
        if (t == max) {
            System.out.println("impossible");
        } else {
            System.out.println(t);
        }

    }

}
