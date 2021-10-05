package com.richard.mszn.栈和队列;

import java.util.Stack;

/**
 * 两种方案时间复杂度都为O(1),空间复杂度都为O(n)
 * 这种情况下min的操作比data的操作少
 * min压入稍微省时间
 */
public class 设计一个有getmin功能的栈1 {

    private static Stack<Integer> stackData = new Stack<>();
    private static Stack<Integer> stackMin = new Stack<>();

    public void push(int newNumber) {
        // 如果一开始min中没有数据那么入栈
        if (stackMin.isEmpty()) {
            stackMin.push(newNumber);
            // 如果新数字比min的栈顶元素小那么入栈
        } else if (newNumber <= getMin()) {
            stackMin.push(newNumber);
        }
        // 无论如何都要给Data中加新数字s
        stackData.push(newNumber);
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        int value = stackData.pop();
        if (value == getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return stackMin.peek();
    }

}
