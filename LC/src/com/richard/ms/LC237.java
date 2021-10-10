package com.richard.ms;

public class LC237 {

    // 核心操作就是node值的覆盖
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

}
