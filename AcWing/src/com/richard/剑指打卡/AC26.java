package com.richard.剑指打卡;

/**
 * 26. 二进制中1的个数
 *  和1做与运算看是否唯一
 *
 *  >>>= 无符号右移
 *  >>= 有符号右移
 *
 *  补码
 */
public class AC26 {

    public static int NumberOf1(int n) {

        int res = 0;

        while (n != 0) {
            res += n&1;
            n >>= 1;
        }

        return  res;

    }

    public static void main(String[] args) {

    }

}
