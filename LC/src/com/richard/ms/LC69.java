package com.richard.ms;

/**
 * 69. x 的平方根
 * 要寻找一个数y^2 <= x
 */
public class LC69 {

    public int mySqrt(int x) {
        int l = 0;
        int r = x;

        while (l < r) {
            // 取巧来 防止越界   也可以写成
            int mid = l + (int)1l + r  >> 1;
            if (mid < x / mid) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
}
