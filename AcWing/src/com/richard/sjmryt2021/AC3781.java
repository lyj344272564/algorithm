package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * AcWing 3781. 乘车问题
 */
public class AC3781 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- != 0) {
            // 有几个班级
            int n = sc.nextInt();
            // 每辆大巴所能坐的人数
            int m = sc.nextInt();

            // 输出要几辆车
            int res = 0;
            // 当前人数
            int cur = 0;

            while (n-- != 0) {
                // 每个班级的人数
                int x = sc.nextInt();

                // 只有当一辆车满了才会执行此if
                if (cur+x > m) {
                    res++;
                    cur = 0;
                }
                cur += x;
            }
            //判断最后一辆车里是否有小朋友
            if (cur != 0) {
                res++;
            }
            System.out.println(res);
        }
    }

}
