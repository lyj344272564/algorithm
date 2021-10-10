package com.richard.ms;



/**
 * 19. 删除链表的倒数第 N 个结点
 */
public class LC19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head==null || n<1) {
            return head;
        }
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            n--;
        }

        // 意思是要删头结点
        if (n == 0) {
            return head.next;
        }

        if (n < 0) {
            cur = head;
            while (++n != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
