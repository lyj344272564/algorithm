package com.richard.lc;



public class LC142 {

    public ListNode detectCycle(ListNode head) {

        if (head==null || head.next==null) {
            return null;
        }

        ListNode first = head.next;
        ListNode slow = head;

        while (first != null) {
            slow = slow.next;
            first = first.next;
            if (first==null) {
                return null;
            }
            first = first.next;
            if (slow == first) {
                slow = head;
                first  = first.next;
                while (slow != first) {
                    slow = slow.next;
                    first = first.next;
                }
                return slow;
            }

        }
        return null;
    }
}
