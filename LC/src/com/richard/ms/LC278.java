package com.richard.ms;

/**
 * 278. 第一个错误的版本
 */
public class LC278 {

    boolean isBadVersion(int version){
        return false;
    }

    public int firstBadVersion(int n) {

        int l = 0;
        int r = n;

        while (l<r) {
            int mid = l + ((r - l) >> 1);
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return r;

    }

}
