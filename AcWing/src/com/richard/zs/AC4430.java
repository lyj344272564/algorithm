package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AC4430 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int lc = 0;
        int rc = 0;
        char[] c = s.toCharArray();
        for (int i=0; i<c.length; i++) {
            if (c[i] == '(') {
                lc++;
            } else if (c[i] == ')') {
                rc++;
            }
        }
        if (lc == rc) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(lc-rc)/2);
        }
    }
}
