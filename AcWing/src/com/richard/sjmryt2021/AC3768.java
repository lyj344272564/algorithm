package com.richard.sjmryt2021;

import java.util.Scanner;

/**
 * AcWing 3768. 字符串删减
 */
public class AC3768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        char[] a = s.toCharArray();

        int count = 0;
        int ret = 0;

        // 这里巧妙的用到了
        /**
         * 我们利用 count 存储当前连续出现字符 xx 的个数。
         * 若出现了一个字符 xx，则 count 加一。
         * 若出现了一个其它字符，则 count 清零。
         * 若当前 count=3，说明遇到了连续三个 xx，此时需要删除一次。特别地，
         * 此时删除最后一个字符 xx 后，可能“补位”的字符仍为 xx，如输入样例 33 所示。此时不能将 count 清零，而应该减一，然后继续遍历。
         */
        for (int i=0; i<n; i++) {
            if (a[i] == 'x') {
                count++;
                if (count == 3) {
                    ret++;
                    count--;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(ret);
    }
}
