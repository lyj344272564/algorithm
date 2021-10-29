package com.richard.剑指打卡;

/**
 * 66. 两个链表的第一个公共结点
 */
public class AC66 {

    public ListNode findFirstCommonNode(ListNode headA, ListNode headB) {

        ListNode ha = headA;
        ListNode hb = headB;

        while (ha != hb) {
            ha = ha==null?headB:ha.next;
            hb = hb==null?headA:hb.next;
        }

        return hb;

    }

}
