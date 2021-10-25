package com.richard.AcWingLC;

import java.util.*;

public class LC20 {

    public boolean isValid(String s) {

        int n = s.length();
        // 首先判断长度, 长度不满足直接false
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>(){
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');

            }
        };

        Deque<Character> stack = new LinkedList<Character>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }

}
