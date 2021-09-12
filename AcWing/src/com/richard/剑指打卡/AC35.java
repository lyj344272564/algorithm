package com.richard.剑指打卡;

/**
 * 35. 反转链表
 */
public class AC35 {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode cur = head;
        // 只需要保证当前不为空就可以
        while (cur!=null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

}
