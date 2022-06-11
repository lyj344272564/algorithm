package com.richard.zs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AC4428 {
    public static void main(String[] args) throws  Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();
        if (n<26) {
            System.out.println("NO");
        }
        s = toLower(s);
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i=0; i<26; i++) {
//            map.put((char) i, 1);
//        }
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        for (int i=0; i<n; i++) {
//            map.put(s.charAt(i), 0);
            set.add(s.charAt(i));
        }
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static String toLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char pos = str.charAt(i);
            if ('A' <= pos && (pos <= 'Z')) {
                result += (char) (pos + ('a' - 'A'));//注意这里要将转换结果强转为char类型
            } else {
                result += pos;
            }
        }
        return result;
    }
}
