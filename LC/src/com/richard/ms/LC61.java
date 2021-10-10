package com.richard.ms;

public class LC61 {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k == 0 || head.next== null) {
            return head;
        }

        ListNode cur = head;
        int n = 1;

        while (cur.next != null) {
            cur = cur.next;
            n++;
        }

        // 求前面的有多长
        int add = n - k % n;
        // 相等直接返回head
        if (add == n) {
            return head;
        }
        // 尾连头
        cur.next = head;
        // 遍历找到在选旋转前新头的前一个节点
        while (add-- > 0) {
            cur = cur.next;
        }

        // 定义头
        ListNode ret = cur.next;
        cur.next = null;
        return ret;

    }

}
