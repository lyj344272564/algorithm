package com.richard.剑指打卡;

import java.awt.*;
import java.rmi.MarshalException;
import java.util.ArrayList;

/**
 * 40. 顺时针打印矩阵
 */
public class AC40 {

    public int[] printMatrix(int[][] matrix) {
//    方式一 模拟
//        int n = matrix.length;
//
//        if (n == 0) {
//            return new int[0];
//        }
//
//        int m = matrix[0].length;
//        int[] res = new int[n*m];
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        boolean[][] visited = new boolean[n][m];
//
//        int[] dx = new int[]{0,1,0,-1};
//        int[] dy = new int[]{1,0,-1,0};
//
//        // d=1 初始方向下标为一
//        int x = 0, y = 0, d = 1;
//
//        for (int i=0; i<n*m; i++) {
//            list.add(matrix[x][y]);
//            visited[x][y] = true;
//            int a = x + dx[d];
//            int b = y + dy[d];
//            if (a < 0 || a >= n || b < 0 || b >= m || visited[a][b]) {
//                d = (d + 1) % 4;
//                a = x + dx[d];
//                b = y + dy[d];
//            }
//            x = a;y = b;
//        }
//
//        for (int i=0; i<list.size(); i++) {
//            res[i] = list.get(i);
//        }
//
//        return res;

        // 方式二 按层模拟
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (matrix == null || rows == 0 || cols == 0) {
            return new int[0];
        }

        int[] res = new int[rows*cols];

        int idx = 0;
        int left = 0;
        int right = cols - 1;
        int top = 0;
        int bottom = rows - 1;

        while (left<=right && top <=bottom) {
            for (int i=left; i<=right; i++) {
                res[idx++] = matrix[top][i];
            }
            for (int i=top+1; i<=bottom; i++) {
                res[idx++] = matrix[i][right];
            }
            if (left<right && top<bottom) {
                for (int i=right-1; i>left; i--) {
                    res[idx++] = matrix[bottom][i];
                }
                for (int i=bottom; i>top; i--) {
                    res[idx++] = matrix[i][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return res;

    }

}
