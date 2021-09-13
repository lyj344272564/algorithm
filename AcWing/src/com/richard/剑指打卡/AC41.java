package com.richard.剑指打卡;

import java.util.Stack;

/**
 * 41. 包含min函数的栈
 */
public class AC41 {

    Stack<Integer> stack = new Stack<>();
    // 辅助栈
    Stack<Integer> min_stack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (min_stack.isEmpty() || min_stack.peek()>=x) {
            min_stack.push(x);
        }
    }

    public void pop() {
        if (stack.peek() == min_stack.peek()) {
            min_stack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
