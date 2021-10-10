package com.richard.ms;

import javax.swing.*;
import java.util.HashMap;

/**
 * 92. 反转链表 II
 */
public class LC92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dum = new ListNode(-1);
        dum.next = head;

        ListNode pre = dum;
        for (int i=0; i<left-1; i++) {
            pre = pre.next;
        }

        // 找到rightNode
        ListNode rightNode = pre;
        for (int i=0; i<right-left+1; i++) {
            rightNode = rightNode.next;
        }

        // 切断出一个子链表（截取链表）
        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        pre.next = null;
        rightNode.next = null;
        reverseLinkedList(leftNode);

        pre.next = rightNode;
        leftNode.next = curr;
        return dum.next;

//      ListNode dum = new ListNode(-1);
//      dum.next = head;
//      ListNode pre = dum;
//
//      for (int i=0; i<left-1; i++) {
//          pre = pre.next;
//      }
//
//      ListNode cur = pre.next;
//      ListNode next;
//      for (int i=0; i<right-left; i++) {
//        next = cur.next;
//        cur.next = next.next;
//        next.next = pre.next;
//        pre.next = next;
//      }
//
//      return dum.next;

    }

    private static void reverseLinkedList(ListNode head) {
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
