package com.richard.剑指打卡;

/**
 * 27. 数值的整数次方
 */
public class AC27 {

    public double Power(double x, int n) {
//        java   api实现
//        return Math.pow(base,exponent);

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1/x;
        }
        double res = Power(x,n/2);
        if (n%2 == 0) {
            return res*res;
        }
        return n<0?res*res*1/x:res*res*x;
    }

}
