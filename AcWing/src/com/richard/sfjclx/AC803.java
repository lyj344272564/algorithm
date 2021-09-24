package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 803. 区间合并
 */
public class AC803 {

    private static final int N = 100010;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<PII> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            String[] cur = br.readLine().split(" ");
            int l = Integer.parseInt(cur[0]);
            int r = Integer.parseInt(cur[1]);
            list.add(new PII(l,r));
        }

        int res = merge(list);

        System.out.println(res);

    }

    private static int merge(List<PII> list) {
        List<PII> res = new ArrayList<>();
        list.sort((o1,o2)->o1.x-o2.x);

        int l = (int)2e-9, r = (int)2e-9;
        for (PII e : list) {
            if (r < e.x) {
                if (r != (int)2e-9) {
                    res.add(new PII(l,r));
                }
                l = e.x;
                r = e.y;
            } else {
                r = Math.max(r,e.y);
            }
        }
        if (r != (int)2e-9) {
            res.add(new PII(l,r));
        }
        return res.size();
    }

}

class PII
{
    int x, y;
    public PII(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
