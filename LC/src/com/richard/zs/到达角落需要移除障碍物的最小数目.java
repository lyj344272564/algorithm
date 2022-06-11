package com.richard.zs;

import java.util.LinkedList;
import java.util.Queue;

public class 到达角落需要移除障碍物的最小数目 {
    public int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        if (grid[0][0] == 1) {
            ans++;
        }
        while (!q.isEmpty()) {
            int[] cc = q.poll();
            int x = cc[0];
            int y = cc[1];
            int[] dx = {1, 0};
            int[] dy = {0,-1};
            int a1 = x + dx[0];
            int b1 = y + dy[0];
            int a2 = x + dx[0];
            int b2 = y + dy[0];
            if (grid[a1][b1]==1) {

            }
            if (grid[a2][b2]==1) {

            }
//            for (int i=0; i<2; i++) {
//                int a = x + dx[i];
//                int b = y + dy[i];
//                if (a>=0&&a<m && b>=0&&b<n) {
//                    if (grid[a][b] == 0) {
//                        q.offer(new int[]{a,b});
//                    } else {
//
//                    }
//                }
//            }
        }
        return ans;
    }
}
