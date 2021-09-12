package com.richard.剑指打卡;

/**
 * 33. 链表中倒数第k个节点
 */
public class AC33 {

    public ListNode findKthToTail(ListNode pListHead, int k) {
        if (pListHead == null) {
            return  null;
        }

        ListNode first = pListHead;
        ListNode low = pListHead;

        while (k-- > 0 ) {
            if (first != null) {
                first = first.next;
            } else {
                return null;
            }
        }

        while (first != null) {
            first = first.next;
            low = low.next;
        }

        return low;
    }

}
