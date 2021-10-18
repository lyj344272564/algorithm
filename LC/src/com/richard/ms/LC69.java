package com.richard.ms;

/**
 * 69. x 的平方根
 * 要寻找一个数y^2 <= x
 */
public class LC69 {

    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = -1;

        while (l<=r) {
            int mid = l + r >> 1;
            if ((long)mid*mid <=x) {
                // 存储mid
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
