package com.richard.mszn.栈和队列;

import java.util.Stack;

/**
 * 这种方案弹出更省事
 */
public class 设计一个有getmin功能的栈2 {

    private static Stack<Integer> stackData = new Stack<>();
    private static Stack<Integer> stackMin = new Stack<>();

    public void push(int newNumber) {
        // 如果一开始min中没有数据那么入栈
        if (stackMin.isEmpty()) {
            stackMin.push(newNumber);
            // 如果新数字比min的栈顶元素小那么入栈
        } else if (newNumber <= getMin()) {
            stackMin.push(newNumber);
        } else {
            int val = stackMin.peek();
            // 无论如何都要给Data中加新数字s
            stackMin.push(val);
        }
        stackData.push(newNumber);

    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        stackMin.pop();
        return stackData.pop();
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return stackMin.peek();
    }
}
