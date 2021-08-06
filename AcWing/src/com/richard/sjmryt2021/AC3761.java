package com.richard.sjmryt2021;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AcWing 3761. 唯一最小数
 */
public class AC3761 {
    public static void main(String[] args) {
        final int  N = 200010;
        int[] w = new int[N];
        int[] cnt = new int[N];
        int m;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        for(int i = 0; i < m; i++){
            int n = input.nextInt();
            Arrays.fill(cnt,0, n+1, 0);
            for (int j = 0; j < n; j++){
                w[j] = input.nextInt();
                cnt[w[j]] ++;
            }
            int res = -1;
            for (int j = 0; j < n; j++){
                if (cnt[w[j]] == 1){
                    if (res == -1 || w[res] > w[j])
                        res = j;
                }
            }
            if (res != -1) res++;
            System.out.println(res);
        }
    }
}
