package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class AC4429 {
    static final int N = 2010;
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] cur = bf.readLine().split(" ");
        int n = Integer.parseInt(cur[0]);
        //x1y1  x2y2 两个wifi基站的坐标
        long x1 = Long.parseLong(cur[1]);
        long y1 = Long.parseLong(cur[2]);
        long x2 = Long.parseLong(cur[3]);
        long y2 = Long.parseLong(cur[4]);
        PII s1 = new PII(x1, y1);
        PII s2 = new PII(x2, y2);
        PII[] q = new PII[N];
        for (int i=0; i<n; i++) {
            cur = bf.readLine().split(" ");
            q[i].x = Long.parseLong(cur[0]);
            q[i].y = Long.parseLong(cur[1]);
        }
        Arrays.sort(q, 0, n, new Comparator<PII>() {
            @Override
            public int compare(PII a, PII b) {
                return (int) (dist(s1, a) - dist(s1, b));
            }
        });
        long res = 0x3f3f3f, r = 0;
        for (int i=n-1; i>=0; i--) {
            res = Math.min(res, dist(q[i], s1)+r);
            r = Math.max(r, dist(q[i], s2));
        }
        res = Math.min(res, r);
        System.out.println(res);
    }
    static long dist(PII a, PII b) {
        long dx = a.x - b.x;
        long dy = a.y - b.y;
        return dx*dx + dy*dy;
    }
    // 坐标
    static class PII {
        long x;
        long y;
        public PII(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
