package com.richard.剑指打卡;

/**
 * 28. 在O(1)时间删除链表结点
 * 相当于一个节点的覆盖
 */
public class AC28 {

    public void deleteNode(ListNode node) {

        ListNode cur = node.next;

        node.val = cur.val;
        node.next = cur.next;

    }

}
