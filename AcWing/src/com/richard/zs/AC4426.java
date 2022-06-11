package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AC4426 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        long res = 0;
        long n = s.length();
        if (s.charAt(0)=='-') {
            s = s.substring(1);
        }
        // 两位数
        for (int i=s.length()-2; i>=0; i--) {
            String tmp = String.valueOf(s.charAt(i) + "" + s.charAt(i+1));
            if (Integer.parseInt(tmp)%4==0) res += (i+1); // i+1是指有多少个以i+1结尾的数字的个数
        }
        // 一位数有几个是4的倍数
        for (int i=0; i<s.length(); i++) {
            if ((s.charAt(i)-'0')%4==0) res++;
        }
        System.out.println(res);
    }
}
