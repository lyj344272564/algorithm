package com.richard.剑指打卡;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 24. 机器人的运动范围
 */
public class AC24 {

    private static boolean[][] st = new boolean[55][55];

    private static int getSum (int x, int y) {
        return getCountSum(x) + getCountSum(y);
    }

    private static int getCountSum (int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    public int movingCount(int threshold, int rows, int cols) {

        if (rows == 0 || cols == 0) {
            return 0;
        }

        Queue<Cord> queue = new LinkedList<>();

        queue.add(new Cord(0,0));
        st[0][0] = true;

        int res = 0;

        while (!queue.isEmpty()) {

            Cord cc = queue.poll();

            int[] dx = new int[]{0, 1, 0, -1};
            int[] dy = new int[]{1, 0, -1, 0};

            if (getSum(cc.x,cc.y) > threshold) {
                continue;
            }
            res++;

            for (int i=0; i<4; i++) {
                int xx = cc.x + dx[i];
                int yy = cc.y + dy[i];
                if (xx >= 0 && yy >= 0 && xx < rows && yy < cols && st[xx][yy] == false && getSum(xx,yy)<=threshold) {
                    queue.add(new Cord(xx,yy));
                    st[xx][yy] = true;
                }
            }

        }
        return res;
    }

}

class Cord {
    public int x;
    public int y;

    public Cord(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
