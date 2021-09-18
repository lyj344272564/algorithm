package com.richard.sfjclx;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 850. Dijkstra求最短路 II
 *
 * https://learnku.com/articles/35637
 */
public class AC850 {
    /**
     * @Test
     * public void testPriorityQueue(){
     *     //默认采用的是最小堆实现的
     *     PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10,new Comparator<Integer>(){
     *         public int compare(Integer a, Integer b){
     *             return a-b; //if a>b 则交换，so这是递增序列
     *         }
     *     });
     *     queue.offer(13);
     *     queue.offer(9);
     *     int len = queue.size();
     *     for(int i=0;i<len;i++){
     *         System.out.println(queue.poll());
     *     }
     *     //输出 9  13
     *     //默认采用的是最小堆实现的
     *     PriorityQueue<Integer> queue2 = new PriorityQueue<>(10);
     *     queue2.offer(11);
     *     queue2.offer(9);
     *     len = queue2.size();
     *     for(int i=0;i<len;i++){
     *         System.out.println(queue2.poll());
     *     }
     *     //输出 9， 11
     *     }
     */

    static int N = 100010;

    static int n, m, idx;
    static int [] h = new int [N] ;
    static int [] w = new int [N] ;
    static int [] e = new int [N] ;
    static int [] ne = new int [N] ;
    static int [] dist = new int [N] ;
    static boolean [] st = new boolean [N];

    private static void add(int a, int b, int c)
    {
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx ++ ;
    }

    public static void main (String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out)) ;
        String [] values = br.readLine().split("\\s+");
        n = Integer.parseInt(values[0]);
        m = Integer.parseInt(values[1]);
        Arrays.fill(h, -1) ;
        while (m-- > 0) {
            values = br.readLine().split("\\s+");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int c = Integer.parseInt(values[2]);
            add(a, b, c);
        }

        int ret = dijkstra(n);
        log.write(ret + "\n") ;
        log.flush();
        log.close();
        br.close();

    }

    private static int dijkstra (int n){
        PriorityQueue<int[]> pq = new PriorityQueue<>(n, (a, b) -> {return a[1] - b[1];});
        int INF = 1 << 30 ;
        Arrays.fill(dist,INF);
        pq.offer(new int []{1, 0}) ;
        dist[1] = 0 ;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int ver = cur[0] ;
            int distance = cur[1] ;
            if (st[ver]) continue ;
            st[ver] = true;
            for (int i = h[ver]; i != -1; i = ne[i]){
                int j = e[i];
                if (dist[j] > distance + w[i]){
                    dist[j] = distance + w[i];
                    pq.offer(new int [] {j, dist[j]});
                }
            }
        }
        return dist[n] == INF ? -1 : dist[n];
    }

}
