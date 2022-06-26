package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Richard
 * @Date: 2022-06-18 19:39
 */
public class AC4482 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        String[] cur = bf.readLine().split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(cur[i]);
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(a);
        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i=0; i<n; i++) {
                map.put(a[i], map.getOrDefault(a[i], 0)+1);
            }
            for (int x : map.keySet()) {
                if (map.get(x) > res) {
                    res = map.get(x);
                }
            }
            System.out.println(res);
        }
    }
}
