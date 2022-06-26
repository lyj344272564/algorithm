package com.richard.zs;

import java.util.HashMap;
import java.util.Map;

public class 替换字符后匹配 {
    int N = 100010;
    int[] ne = new int[N];
    public boolean matchReplacement(String ss, String sub, char[][] mappings) {
        int k = mappings.length;
        for (int i=0; i<k; i++) {
            sub.replace(mappings[i][0], mappings[i][1]);
        }
        int n = sub.length();
        String s1 = sub;
        int m = ss.length();
        String s2 = ss;
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
                return true;
            }
        }
        return false;
    }
}
