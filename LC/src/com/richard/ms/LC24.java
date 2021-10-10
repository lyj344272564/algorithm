package com.richard.ms;

/**
 * 24. 两两交换链表中的节点
 */
public class LC24 {

    public ListNode swapPairs(ListNode head) {

       ListNode dum = new ListNode(0);
       dum.next = head;
       ListNode temp = dum;

       while (temp.next!=null && temp.next.next!=null) {
           ListNode node1 = temp.next;
           ListNode node2 = temp.next.next;
           // 起到了连接作用
           temp.next = node2;
           // 第一个指向下一个的下一个
           node1.next = node2.next;
           // 第二个指向第一个
           node2.next = node1;
           // 后移
           temp = node1;
       }

       return dum.next;

    }

}
