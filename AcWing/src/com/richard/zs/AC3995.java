package com.richard.zs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3995. 最小的和
 */
public class AC3995 {

    static final int N = 110;
    static int[] a = new int[N];
    static int[] b = new int[N];
    static int[] d = new int[N];
    static int n, k1, k2;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        n = Integer.parseInt(val[0]);
        k1 = Integer.parseInt(val[1]);
        k2 = Integer.parseInt(val[2]);

        int m = k1 + k2;

        String[] cur = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
        }
        cur = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            b[i] = Integer.parseInt(cur[i]);
        }

        for (int i=0; i<n; i++) {
            d[i] = Math.abs(a[i] - b[i]);
        }

        long res = 0;
        for (int i=0; i<m; i++) {
            // 标志位 看这个是否减为0
            int t = 0;
            for (int j=0; j<n; j++) {
                // 从最大的开始遍历
                if (d[j] > d[t]) {
                    t = j;
                }
            }
            if (d[t] == 0) {
                res = (m-i) % 2;
                break;
            }
            // 每次都减1
            d[t]--;
        }
        for (int i=0; i<n; i++) {
            res += (long)d[i]*d[i];
        }

        System.out.println(res);

    }

}
