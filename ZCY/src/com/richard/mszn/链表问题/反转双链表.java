package com.richard.mszn.链表问题;

public class 反转双链表 {

    public static DoubleNode reserveList(DoubleNode head) {

        DoubleNode pre = null;
        DoubleNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            // 后移
            pre = head;
            head = next;
        }

        return pre;
    }

}
