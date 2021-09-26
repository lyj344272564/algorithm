package com.richard.zs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 3988. 不同的数
 */
public class AC3988 {

    public static void main (String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] val = br.readLine().split(" ");

        int n = Integer.parseInt(val[0]);
        int k = Integer.parseInt(val[1]);

        Map<Integer, Integer> map = new HashMap<>();
        String[] cur = br.readLine().split(" ");

        for (int i=1; i<=n; i++) {

            int a = Integer.parseInt(cur[i-1]);
            map.put(a,i);
        }

        if (map.size() < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int cnt = 0;
            for (Integer x : map.keySet()) {
                if (++cnt > k) break;
                int idx = map.get(x);
                System.out.print(idx + " ");
            }

        }




    }


}
