package com.richard.剑指打卡;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AC77 {

    public String reverseWords(String s) {

        String[] s1 = s.split(" ");
        List<String> stringList = new ArrayList<>();

        for (int i=0; i<s1.length; i++) {
            stringList.add(s1[i]);
        }

        Collections.reverse(stringList);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<stringList.size(); i++) {
            if (i < stringList.size()-1) {
                sb.append(stringList.get(i) + " ");
            } else {
                sb.append(stringList.get(i));
            }
        }

        return sb.toString();
    }

}
