package com.richard.mszn.链表问题;

import com.sun.prism.shader.FillCircle_LinearGradient_PAD_AlphaTest_Loader;
import sun.util.resources.cldr.ga.TimeZoneNames_ga;

import java.util.Stack;

public class 判断一个链表是否为回文结构 {

    /**
     * 全部入栈
     * @param head
     * @return
     */
    public boolean isPalindrome1(Node head) {

        if (head==null || head.next==null) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        Node cur = head;

        while (cur != null) {

            stack.add(cur.value);
            cur = cur.next;

        }

        cur = head;
        while (cur != null) {
            if (cur.value != stack.pop()) {
                return false;
            }
            cur = cur.next;
        }

        return false;
    }

    /**
     * 只需要入栈一半
     * @param head
     * @return
     */
    public boolean isPalindrome2(Node head) {

        if (head==null || head.next==null) {
            return true;
        }

        Node right = head.next;
        Node cur = head;

        while (cur.next!=null && cur.next.next!=null) {
            right = right.next;
            cur = cur.next.next;
        }

        Stack<Node> stack = new Stack<>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }

        while (!stack.isEmpty()) {

            if (head.value != stack.pop().value) {
                return false;
            }

            head = head.next;
        }

        return false;

    }

}
