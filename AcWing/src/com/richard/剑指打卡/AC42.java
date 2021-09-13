package com.richard.剑指打卡;

import java.util.Stack;

/**
 * 42. 栈的压入、弹出序列
 */
public class AC42 {

    public boolean isPopOrder(int [] pushV,int [] popV) {

        if (pushV.length != popV.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int i = 0;

        for (int x : pushV) {
            stack.push(x);
            while (stack.size()!=0 && stack.peek() == popV[i]) {
                i++;
                stack.pop();
            }
        }

        return !stack.isEmpty();

    }

}
