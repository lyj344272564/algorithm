package com.richard.sfjclx;

import java.io.*;

/**
 * 831. KMP字符串
 * s母 p子
 */
public class AC831 {

    static int N = 100010;
    static int ne[] = new int[N];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer n = Integer.parseInt(br.readLine());
        String s1 = " " + br.readLine();
        Integer m = Integer.parseInt(br.readLine());
        String s2 = " " + br.readLine();
        char[] p = s1.toCharArray();
        char[] s = s2.toCharArray();

        //ne  n
        for (int i=2,j=0; i<=n; i++) {
            while (j!=0 && p[i]!=p[j+1]) {
                j = ne[j];
            }
            if (p[i] == p[j+1]) {
                j++;
            }
            ne[i] = j;
        }

        // 匹配 m
        for (int i=1,j=0; i<=m; i++) {
            while (j!=0 && s[i]!=p[j+1]) {
                j = ne[j];
            }
            if (s[i] == p[j+1]) {
                j++;
            }
            if (j == n) {
                j = ne[j];
                bw.write(i-n + " ");
            }

        }

        bw.flush();
    }

}
