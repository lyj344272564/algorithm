package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AC4479 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] cur = bf.readLine().split(" ");
        int n = Integer.parseInt(cur[0]);
        int m = Integer.parseInt(cur[1]);
        int[] a = new int[n];
        int[] b = new int[m];
        cur = bf.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
        }
        cur = bf.readLine().split(" ");
        for (int i=0; i<m; i++) {
            b[i] = Integer.parseInt(cur[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<m; i++) {
            list.add(b[i]);
        }
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (list.contains(a[i])) {
                res.add(a[i]);
            }
        }
        int[] ans = new int[res.size()];
        for (int i=0; i<res.size(); i++) {
            ans[i] = res.get(i);
            System.out.print(ans[i] + " ");
        }
    }
}
