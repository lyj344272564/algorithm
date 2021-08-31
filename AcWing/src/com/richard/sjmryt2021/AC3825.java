package com.richard.sjmryt2021;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 3825. 逃离大森林
 */
public class AC3825 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        char[][] g = new char[n][m];

        for (int i = 0; i < n; i++) {
            g[i] = sc.next().toCharArray();
        }


        Pair s = null, e = null;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 'S')
                    s = new Pair(i, j);
                if (g[i][j] == 'E')
                    e = new Pair(i, j);
                if (s != null && e != null)
                    break;
            }
        }


        int[][] w = new int[n][m];
        boolean[][] st = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        q.offer(e);
        st[e.x][e.y] = true;

        int idx = 0;
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int size = q.size();
            idx++;
            while (size-- > 0) {
                Pair p = q.poll();

                for (int i = 0; i < 4; i++) {
                    int a = p.x + dx[i], b = p.y + dy[i];
                    if (a < 0 || a >= n || b < 0 || b >= m || st[a][b] || g[a][b] == 'T')
                        continue;
                    w[a][b] = idx;
                    q.offer(new Pair(a, b));
                    st[a][b] = true;
                }
            }

        }

        int max = w[s.x][s.y];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] != 'T' && g[i][j] != 'S' && g[i][j] != 'E') {
                    int step = w[i][j], num = g[i][j] - '0';
                    if (step <= max && step != 0)
                        ans += num;
                }
            }
        }
        // System.out.println(Arrays.toString(w[0]));
        System.out.println(ans);

    }

}
class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
