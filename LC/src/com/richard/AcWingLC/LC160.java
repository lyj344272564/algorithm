package com.richard.AcWingLC;

public class LC160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p = headA;
        ListNode q = headB;

        while (p != q) {
            p = p!=null?p.next:headB;
            q = q!=null?q.next:headA;
        }

        return p;

    }

}
