package com.richard.AcWingLC;


public class LC23 {


    public ListNode mergeKLists(ListNode[] lists) {

        return merge(lists,0,lists.length-1);

    }

    public ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }

        if (l > r) {
            return null;
        }
        int mid = l + r >> 1;

        return mergeTwoLists(merge(lists,l,mid), merge(lists,mid+1,r));
    }

//   方法一  调用合并两个链表的方法
//    public ListNode mergeKLists(ListNode[] lists) {
//
//        ListNode ans = null;
//
//        for (int i=0; i<lists.length; i++) {
//            ans = mergeTwoLists(ans,lists[i]);
//        }
//
//        return ans;
//
//    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);

        ListNode prev = pre;
        while (l1!=null && l2!=null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1==null?l2:l1;

        return pre.next;
    }
}
