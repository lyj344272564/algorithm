package com.richard.lc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LC1337 {

    public static void main(String[] args) {

    }

    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length, n = mat[0].length;

        List<int[]> power = new ArrayList<int[]>(); // 存储

        for (int i = 0; i < m; ++i) {

            int l = 0, r = n-1, pos = -1;

            while (l<=r) {
                int mid = l + (r - l) / 2 ;
                if (mat[i][mid] == 0) {
                    r = mid - 1;
                } else {
                    pos = mid; // 第一次出现1的地方 从后往前遍历
                    l = mid + 1;
                }
            }
            power.add(new int[]{pos + 1, i}); // 集合中存储
        }

        //
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        for (int[] pair: power) {
            pq.offer(pair);
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; ++i) {
            ans[i] = pq.poll()[1];
        }

        return ans;

    }

}
