package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 899. 编辑距离
 */
public class AC899 {

    static final int N = 15;
    static final int M = 1010;
    static int n, m;
    static int[][] f = new int[N][N];
    static String[] str = new String[M];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");

        n = Integer.parseInt(val[0]);
        m = Integer.parseInt(val[1]);

        for(int i=0; i<n; i ++){
            str[i] = " " + br.readLine();
        }

        for(int i=0; i<m; i ++){
            String[] str1 = br.readLine().split(" ");
            String t = " " + str1[0];
            Integer limit = Integer.parseInt(str1[1]);

            int res = MinMov(t,limit);
            System.out.println(res);
        }

    }

    public static int MinMov(String t, int limit){
        int ans = 0;
        int tSize = t.length() - 1;
        //System.out.println(t);
        for(int i = 0 ; i < n ;i ++){
            int[][] f = new int[N][N];
            int strSize = str[i].length() - 1;
            for(int j = 0; j <= tSize; j ++) {
                f[j][0] = j; //删除操作
            }
            for(int j = 0; j <= strSize; j ++) {
                f[0][j] = j; //增加操作
            }

            for(int j = 1; j <= tSize; j ++){
                for(int k = 1;k <= strSize; k ++){
                    f[j][k] = Math.min(f[j-1][k] + 1, f[j][k-1] + 1);
                    if(t.charAt(j) == str[i].charAt(k)) {
                        f[j][k] = Math.min(f[j][k], f[j-1][k-1]);
                    } else {
                        f[j][k] = Math.min(f[j][k], f[j-1][k-1] + 1);
                    }
                }
            }
            if(f[tSize][strSize] <= limit) {
                ans ++;
            }
        }
        return ans;
    }

}
