package com.richard.剑指打卡;

/**
 * 25. 剪绳子
 *
 * N 尽可能多的3
 *
 *
 */
public class AC25 {

    public int maxProductAfterCutting(int m) {

        // 特判 小于等于三  但是段数必须大于2
        if (m <= 3) {
            return 1 * (m-1);
        }

        int res = 1;
        // 取余3 说明除了三职位多余个4
        if (m%3 == 1) {
            res *= 4;
            m -=4;
        }

        // 取余3  说明多一个2
        if (m%3 == 2) {
            res *= 2;
            m -= 2;
        }

        while (m >= 0) {
            res *= 3;
            m -= 3;
        }

        return res;

    }

}
