package com.richard.剑指打卡;

/**
 * 48. 复杂链表的复刻
 */
public class AC48 {

    public ListNodeRandom copyRandomList(ListNodeRandom head) {

        if (head == null) {
            return null;
        }

        ListNodeRandom cur = head;
        ListNodeRandom next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = new ListNodeRandom(cur.val);
            cur.next.next = next;
            cur = next;
        }

        cur = head;
        ListNodeRandom curCopy = null;

         while (cur != null) {

             next = cur.next.next;
             curCopy = cur.next;
             curCopy.random = cur.random!=null ? cur.random.next : null;
             cur = next;

         }

         ListNodeRandom res = head.next;
         cur = head;

         while (cur != null) {
             next = cur.next.next;
             curCopy = cur.next;
             curCopy.next = next!=null ? next.next : null;
             cur = next;
         }

         return res;
    }

}

class ListNodeRandom{
    int val;
    ListNodeRandom next,random;
    ListNodeRandom(int x) {
        this.val = x;
    }

}
