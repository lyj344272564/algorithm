package com.richard.zs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3994. 水果派
 */
public class AC3994 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n-- != 0) {
            String[] val = br.readLine().split(" ");

            int a = Integer.parseInt(val[0]);
            int b = Integer.parseInt(val[1]);
            int c = Integer.parseInt(val[2]);
            int d = Integer.parseInt(val[3]);
            int k = Integer.parseInt(val[4]);


            int y = (int)Math.ceil((double)b/d);
            int x = (int)Math.ceil((double)a/c);

            if (x+y <= k) {
                x = k-y;
                System.out.println(x + " " + y);
            } else {
                System.out.println(-1);
            }



        }

    }

}
