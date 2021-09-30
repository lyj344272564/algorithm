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
    private static int[][] g = new int[N][N];
    private static int[][] d = new int[N][N];
    private static PI[] q = new PI[N*N];
    private static int n;
    private static int m;

    private static int bfs() {
        int hh = 0;
        int tt = 0;
        // 初始化队列
        q[0] = new PI(0,0);

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                d[i][j] = -1;
            }
        }
        // 初始化距离
        d[0][0] = 0;

        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        while (hh <= tt) {
            // 出队
            PI t = q[hh++];
            for (int i=0; i<4; i++) {
                int x = t.getFirst() + dx[i];
                int y = t.getSecond() + dy[i];
                if (x>=0 && x<n && y>=0 && y<m && d[x][y]==-1 && g[x][y]==0) {
                    d[x][y] = d[t.getFirst()][t.getSecond()] + 1;
                    // 添加到队列中
                    q[++tt] = new PI(x,y);
                }
            }

        }
        return d[n-1][m-1];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        for (int i=0; i<n; i++) {
            String[] cur = br.readLine().split(" ");
            for (int j=0; j<m; j++) {
                g[i][j] = Integer.parseInt(cur[j]);
            }
        }

        System.out.println(bfs());

        br.close();

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
