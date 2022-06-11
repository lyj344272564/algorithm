package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AC4425 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = s.length();
        StringBuilder res = new StringBuilder();
        if (s.charAt(0) > '4' && s.charAt(0) != '9') {
            res.append('9'-s.charAt(0));
        } else {
            res.append(s.charAt(0));
        }
        for (int i=1; i<n; i++) {
            if (s.charAt(i) > '4') {
                res.append('9'-s.charAt(i));
            } else {
                res.append(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}
