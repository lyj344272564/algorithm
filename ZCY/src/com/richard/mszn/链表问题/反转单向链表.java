package com.richard.mszn.链表问题;

public class 反转单向链表 {

    public static Node reserveList(Node head) {

        Node pre = null;
        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            // 后移
            pre = head;
            head = next;
        }

        return pre;
    }

}
