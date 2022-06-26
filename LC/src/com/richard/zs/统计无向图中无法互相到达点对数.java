package com.richard.zs;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Richard
 * @Date: 2022-06-26 9:53
 */
public class 统计无向图中无法互相到达点对数 {
    private final int N = 100010;
    private int[] p = new int[N];
    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }
    public long countPairs(int n, int[][] edges) {
        long res = 0;
        for (int i=0; i<n; i++) {
            p[i] = i;
        }
        for (int i=0; i<edges.length; i++) {
            p[find(edges[i][0])] = find(edges[i][1]);
        }
        Map<Integer,Integer> cnt = new HashMap<>();
        for (int i=0; i<n; i++) {
            int root = find(i);
            cnt.put(root,cnt.getOrDefault(root,0)+1);
        }
        for (int x : cnt.values()) {
            res += 1L*(n-x)*x;
        }
        return res/2;
    }
}
