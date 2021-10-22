package com.richard.AcWingLC;

public class LC141 {

    public boolean hasCycle(ListNode head) {

        // 肯定没有环
        if (head == null || head.next==null) {
            return false;
        }

        ListNode first = head.next;
        ListNode slow = head;

        // 如果first为null则无环
        // 为啥first要走两次 因为，first是slow的两倍
        while (first != null) {
            slow = slow.next;
            // 再往下找一个
            first = first.next;
            // 如果此时是null, 则不能形成环
            if (first == null) {
                return false;
            }
            first = first.next;
            if (slow == first) {
                return true;
            }
        }
        return false;

    }

}
