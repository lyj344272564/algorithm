package com.richard.sjmryt2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 3783. 第 k 个除数
 */
public class AC3783 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();
        int k = sc.nextInt();

        Long x = Long.valueOf(1);

        List<Long> res = new ArrayList<>();

        // 很巧妙的避免了重复   这个也可以用来寻找质数
        while (x*x < n) {
            // 如果整除
            if (n%x == 0) {
                res.add(x);
                res.add(n/x);
            }
            x++;
        }
        if (x*x == n) {
            res.add(x);
        }
        // 排序
        Collections.sort(res);

        for (Long re : res) {
            System.out.println(re);
        }
        System.out.println(1111111111);

        if (res.size() < k) {
            System.out.println("-1");
        } else {
            System.out.println(res.get(k-1));
        }

    }
}
