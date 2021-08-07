package com.richard.sfjclx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AcWing 790. 数的三次方根
 */
public class AC790 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double n = Double.parseDouble(in.readLine());

        double l=-10000;

        double r=10000;

        while(r-l>1e-8) {
            double mid = (l+r)/2;
            if(mid*mid*mid < n) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.printf("%.6f\n",l);

    }

}
