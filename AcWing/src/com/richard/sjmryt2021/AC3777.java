package com.richard.sjmryt2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * AcWing 3777. 砖块
 */
public class AC3777 {
    static char[] ss;

    static void upadte(int i) {
        if (ss[i] == 'W') {
            ss[i] = 'B';
        } else {
            ss[i] = 'W';
        }
    }

    static boolean check(String temp, char c) {

        List<Integer> res = new ArrayList<>();

        ss = temp.toCharArray();
        int n = ss.length;

        for (int i=0; i<n-1; i++) {
            if (ss[i] != c) {
                upadte(i);
                upadte(i+1);
                res.add(i);
            }
        }
        if (ss[n-1] != ss[0]) {
            return false; // 说明不可能弄成相同的
        }
        System.out.println(res.size());
        for (Integer re : res) {
            System.out.print(re+1+" ");
        }
        if (res.size() != 0) {
            System.out.println();
        }
        return true;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nT = sc.nextInt();

        while (nT-- != 0) {

            int n = sc.nextInt();

            String temp =  sc.next();

            if (!check(temp,'W') && !check(temp,'B')) {
                System.out.println("-1");
            }

        }

    }
}
