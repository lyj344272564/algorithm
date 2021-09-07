package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * bfs
 * 844. 走迷宫
 */
public class AC844 {

    private static final int N = 110;
    //g 图  d距离
    private static int[][] g = new int[N][N], d = new int[N][N];
    // 队列
    private static PI[] q = new PI[N * N];
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = reader.readLine().split(" ");
        n = Integer.parseInt(str1[0]);
        m = Integer.parseInt(str1[1]);

        for (int i = 0; i < n; i++) {
            String[] str = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                g[i][j] = Integer.parseInt(str[j]);
            }
        }
        System.out.println(bfs());
        reader.close();
    }
    private static int bfs() {
        int hh = 0, tt = 0;
        q[0] = new PI(0, 0);
        // 距离初始化为-1
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[j][i] = -1;
            }
        }
        // 刚开始距离为0
        d[0][0] = 0;
        // 向量上下左右
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        while (hh <= tt) {
            PI t = q[hh++];
            for (int i = 0; i < 4; i++) {
                int x = t.getFirst() + dx[i], y = t.getSecond() + dy[i];
                if (x >= 0 && x < n && y >= 0 && y < m && g[x][y] == 0 && d[x][y] == -1) {
                    d[x][y] = d[t.getFirst()][t.getSecond()] + 1;
                    q[++tt] = new PI(x, y);
                }
            }
        }
        return d[n - 1][m - 1];
    }


}
class PI {
    private int first;
    private int second;

    public PI(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public PI() {

    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
