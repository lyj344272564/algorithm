package com.richard.lc;

import sun.nio.cs.FastCharsetProvider;

/**
 * 141. 环形链表 I
 */
public class LC141 {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode first = head.next;
        ListNode slow = head;

        while (first != null) {
            slow = slow.next;
            first = first.next;
            if (first == null) {
                return false;
            }
            first = first.next;
            // 有环必相遇
            if (slow == first) {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
