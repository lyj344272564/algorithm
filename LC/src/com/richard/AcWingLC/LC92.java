package com.richard.AcWingLC;

public class LC92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dum = new ListNode(-1);

        dum.next = head;

        ListNode pre = dum;

        // 找到左面的前一个
        for (int i=0; i<left-1; i++) {
            pre = pre.next;
        }

        ListNode rightNode = pre;

        // 找到右面的前一个
        for (int i=0; i<right-left+1; i++) {
            rightNode = rightNode.next;
        }

        // 为了连接
        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        // 断链
        pre.next = null;
        rightNode.next = null;

        // 反转
        reserveList(leftNode);

        // 断链连接
        pre.next = rightNode;
        leftNode.next = curr;

        return dum.next;
    }

    private void reserveList(ListNode head) {
        if (head == null) {
            return ;
        }

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

    }

}