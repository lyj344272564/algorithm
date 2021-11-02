package com.richard.剑指打卡;

import java.util.ArrayList;
import java.util.List;

public class AC80 {

    public int[] numberOfDice(int n) {
        int[][] f = new int[n + 1][n * 6 + 1];//f[i][j] 前i次，总和为j
        f[0][0] = 1;
        for (int i = 1; i <= n; i++) { //一共n 次
            for (int j = 1; j <= i * 6; j++) { //骰 i 次 值可为 1~6*i
                for (int k = 1; k <= Math.min(j, 6); k++) { //最后一次为k k可以投出1~min(j,6)
                    f[i][j] += f[i - 1][j - k];
                }
            }
        }
        List<Integer> list = new ArrayList();
        for (int i = n; i <= n * 6; i++) { //按照题意，投了N次 则 需要n的那一行
            list.add(f[n][i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
