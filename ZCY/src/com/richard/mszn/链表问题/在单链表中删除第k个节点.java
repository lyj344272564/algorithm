package com.richard.mszn.链表问题;

public class 在单链表中删除第k个节点 {

    public Node removeLastKthNode(Node head, int lastKth) {

        if (head == null || lastKth < 1) {
            return head;
        }

        Node cur = head;


        while (cur != null) {
            lastKth--;
            cur = cur.next;
        }

        // 如果k正好等于0 那么删除的就是第一个节点
        if (lastKth == 0) {
            head = head.next;
        }

        // 如果k小于0，
        if (lastKth < 0) {
            cur = head;
            // 继续从head开始遍历 当k等于0时就到达了要删除的前一个节点  理由就是k走的正好是链表的长度
            while (++lastKth != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }

        return head;
    }


}
