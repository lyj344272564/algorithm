package com.richard.剑指打卡;

/**
 * 57. 数字序列中某一位的数字
 * 1. 确定是几位数
 * 2. 确定是几位数的第几个数
 * 3. 属于哪个数的第几位
 */
public class AC57 {

    public int digitAtIndex(int n) {

        int i = 1;
        long s = 9;
        int base = 1;

        while (n > i * s) {
            n -= i*s;
            i++;
            s *= 10;
            base *= 10;
        }

        int num = base + (n+i-1)/i - 1;

        int r = n%10==0 ? i : n%i;

        for (int j=0; j<i-r; j++) {
            num /= 10;
        }

        return num%10;


//        //01234567891011121314...
//        //0-9  10(9) 9*1
//        //10-99 90*2 9*10*2
//        //100-999 900*3 9*100*3
//        //1000-9999 9000*4 9*1000*4
//
//        // 从1开始但是还有0
//        n++;
//        // 减去0
//        n--;
//        // 位数
//        int i = 1;
//        // 这一位有多少个数
//        long s = 9;
//        // 这一位数的刚开始的数字
//        int base = 1;
//
//        while (n > i*s) {
//            n -= i*s;
//            i++;
//            s *= 10;
//            base *= 10;
//        }
//
//        long num = base + (n-1)/i;
//
//        return Long.toString(num).charAt((n-1)%i) - '0';

    }
}
