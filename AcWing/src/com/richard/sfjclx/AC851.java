package com.richard.sfjclx;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 851. spfa求最短路
 */
public class AC851 {
    static int N = 100010;
    static int[] h = new int[N];
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] w = new int[N];
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];
    static int idx;
    static int max = (int)1e9;
    static int n,m;

    static void add(int a, int b, int c){
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    static int spfa(){

        Arrays.fill(dist, max);
        dist[1] = 0;
        st[1] = true;

        //声明一个队列保存更新过的节点
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);

        while(!q.isEmpty()){

            int cur = q.poll();
            st[cur] = false;

            for(int i=h[cur]; i!=-1; i=ne[i]){
                int j = e[i];
                //如果当前节点可以被更新，就做更新操作，并将该节点加入到队列中
                if(dist[j] > dist[cur]+w[i]){
                    dist[j] = dist[cur] + w[i];

                    if(!st[j]){
                        q.add(j);
                        st[j] = true;
                    }
                }
            }
        }
        return dist[n];
    }

    public static void main(String[]args) throws IOException{
        Arrays.fill(h, -1);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] cur = in.readLine().split(" ");
        n = Integer.parseInt(cur[0]);
        int m = Integer.parseInt(cur[1]);

        while(m-->0){
            String[] arr = in.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            add(a, b, c);
        }

        int t = spfa();
        if(t==max) {
            System.out.println("impossible");
        } else {
            System.out.println(t);
        }
    }

}
