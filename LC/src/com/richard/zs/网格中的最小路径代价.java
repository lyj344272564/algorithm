package com.richard.zs;

import java.util.Arrays;

public class 网格中的最小路径代价 {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        // 初始化第一行
        for (int i=0; i<n; i++) {
            dp[0][i] = grid[0][i];
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int tmp = Integer.MAX_VALUE;
                for (int k=0; k<n; k++) {
                    tmp = Math.min(tmp, dp[i-1][k] + moveCost[grid[i-1][k]][j]);// 上一行最下值
                }
                dp[i][j] = tmp + grid[i][j];
            }
        }
        return Arrays.stream(dp[m-1]).min().orElse(-1);
    }
}
