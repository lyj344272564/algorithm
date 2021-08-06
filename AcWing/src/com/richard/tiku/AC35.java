package com.richard.tiku;

/**
 * 35. 反转链表
 */


public class AC35 {

    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode pre = null;

        while (head != null) {

            next = head.next;
            head.next = pre;
            pre = head;
            head = next;

        }
        return pre;
    }
}


class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}