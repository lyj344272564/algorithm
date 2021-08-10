package com.richard.sfjclx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 803. 区间合并
 */
public class AC803 {

    private static final int N = 100010;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<PII> list  = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            list.add(new PII(l,r));
        }

        int ans = merge(list);

        System.out.println(ans);
    }

    private static int merge(List<PII> list) {

        List<PII> res = new ArrayList<>();

        list.sort((o1, o2) -> o1.x - o2.x);

        int l = (int)-2e9, r = (int)-2e9;

        for (PII e : list) {

            if (r <= e.x) {
                if (r != (int)-2e9) {
                    res.add(new PII(l, r));
                }
                l = e.x;
                r = e.y;
            } else { // 有交集 更新右端点为较大的
                r = Math.max(r, e.y);
            }

        }
        if (r != (int)-2e9) {
            res.add(new PII(l, r));
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
