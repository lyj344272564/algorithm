package com.richard.剑指打卡;

import java.util.Stack;

/**
 * 20. 用两个栈实现队列
 * 不管是出还是入 都有一个前提就是s2 W为空
 */
public class AC20 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /** Initialize your data structure here. */
    public AC20() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       if (stack2.empty()) {
           while (!stack1.empty()) {
               stack2.push(stack1.pop());
           }
       }
       return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }

}
