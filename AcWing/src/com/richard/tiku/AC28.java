package com.richard.tiku;

/**
 * 28. 在O(1)时间删除链表结点
 */
public class AC28 {

    public void deleteNode(ListNode node) {
        // 把下一个节点的值给了要删除的值此时要删除的值已经被下一个值覆盖
        node.val = node.next.val;
        // 删除下一个值
        node.next = node.next.next;
    }

}
