package com.richard.剑指打卡;


public class AC60 {

    public int getMaxValue(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] f = new int[n+1][m+1];

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                f[i][j] = Math.max(f[i-1][j],f[i][j-1]) + grid[i-1][j-1];
            }
        }

        return f[n][m];

    }

}
