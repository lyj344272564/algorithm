package com.richard.mszn.链表问题;

public class 打印两个有序链表的公共部分 {

    public static void printCommonPart(Node head1, Node head2) {
        System.out.println("CommonPart:");
        while (head1!=null && head2!=null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            } else if (head1.value > head2.value){
                head2 = head2.next;
            } else {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }


}

class Node {
    public int value;
    public Node next;
    public void Node(int value) {
        this.value = value;
    }
}

