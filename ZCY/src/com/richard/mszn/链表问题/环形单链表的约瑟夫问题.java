package com.richard.mszn.链表问题;

public class 环形单链表的约瑟夫问题 {

    public Node josephusKilll(Node head, int m) {

        if (head==null || head.next==null || m<1) {
            return head;
        }

        Node last = head;
        // 找到尾结点
        while (last.next != head) {
            last = last.next;
        }

        int count = 0;
        while (head != last) {
            if (++count == m) {
                last.next = head.next;
            } else {
                last = last.next;
            }
            head = last.next;
        }

        return head;

    }

}
