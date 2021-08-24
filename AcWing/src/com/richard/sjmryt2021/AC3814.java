package com.richard.sjmryt2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 3814. 矩阵变换
 */
public class AC3814 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String,Integer> map = new HashMap<>();

        int res = 1;
        for (int i=0; i<n; i++) {
            String s = sc.next();
            if (!map.containsKey(s)) {
                map.put(s,0);
            }

            map.put(s,map.get(s)+1);

            res = Math.max(res,map.get(s));
        }

        System.out.println(res);

    }

}
