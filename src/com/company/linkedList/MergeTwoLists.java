package com.company.linkedList;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode head = null, tail = null;
        for (int i = 0; i < 3; i++) {
            if (head == null) {
                head = new ListNode(i);
                tail = head;
            } else {
                tail.next = new ListNode(i);
                tail = tail.next;
            }
        }
        System.out.println(head.next.next.next.next);

        String a="1",b="2";
    }
}
