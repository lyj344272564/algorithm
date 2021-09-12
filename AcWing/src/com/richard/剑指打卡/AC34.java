package com.richard.剑指打卡;

/**
 * 34. 链表中环的入口结点
 */
public class AC34 {

    public ListNode entryNodeOfLoop(ListNode head) {

        ListNode i = head;
        ListNode j = head;

        while (i != null && j != null) {
            i = i.next;
            j = j.next;
            if (j != null) {
                j = j.next;
                if (j == null) {
                    return null;
                }
            }
            if (i == j) {
                i = head;
                while (i != j) {
                    i = i.next;
                    j = j.next;
                }
                return i;
            }
        }

        return null;
    }

}
