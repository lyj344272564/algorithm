package com.richard.剑指打卡;

/**
 * 29. 删除链表中重复的节点
 */
public class AC29 {

    public ListNode deleteDuplication(ListNode head) {

        ListNode dum = new ListNode(-1);

        dum.next = head;

        ListNode p = dum;

        while (p.next != null) {

            ListNode q = p.next;

            while (q != null && p.next.val == q.val) {
                q = q.next;
            }
            if (p.next.next == q) {
                p = p.next;
            } else {
                p.next = q;
            }

        }

        return dum.next;

    }

}
