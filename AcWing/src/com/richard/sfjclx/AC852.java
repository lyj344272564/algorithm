package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.TrustAnchor;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 852. spfa判断负环
 */
public class AC852 {

    static int N = 100010;

    static int[] h = new int[N];
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] w = new int[N];
    static int[] dist = new int[N];
    // 表示当前最短路边的数量
    static int[] cnt = new int[N];
    static boolean[] st = new boolean[N];
    static int idx;
    static int n;

    static void add(int a, int b, int c){
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    static boolean spfa(){

        //声明一个队列保存更新过的节点
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i=1; i<=n; i++) {
            st[i] = true;
            q.offer(i);
        }

        while(!q.isEmpty()){

            int cur = q.poll();
            st[cur] = false;

            for(int i=h[cur]; i!=-1; i=ne[i]){
                int j = e[i];
                //如果当前节点可以被更新，就做更新操作，并将该节点加入到队列中
                if(dist[j] > dist[cur] + w[i]){
                    dist[j] = dist[cur] + w[i];
                    // 一条边变成两条边
                    cnt[j] = cnt[cur] + 1;

                    // 1~x 至少经过了 n+1个点  表示有负环 抽屉原理
                    if (cnt[j] > n) {
                        return true;
                    }
                    if(!st[j]){
                        q.add(j);
                        st[j] = true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[]args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] cur = in.readLine().split(" ");
        n = Integer.parseInt(cur[0]);
        int m = Integer.parseInt(cur[1]);

        Arrays.fill(h, -1);
        while(m-->0){
            String[] arr = in.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            add(a, b, c);
        }

        if(spfa()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
