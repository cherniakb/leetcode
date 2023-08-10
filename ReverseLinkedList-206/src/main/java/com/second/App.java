package com.second;

import com.problems.ListNode;

import static java.util.Objects.nonNull;

public class App {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(1))));
//        ListNode listNode = new ListNode(1);
        ListNode listNode1 = reverseList(listNode);
        System.out.println(listNode1);
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode newHead = new ListNode(head.val);

        while (nonNull(head.next)) {
            ListNode next = head.next;
            next.next = newHead;
            newHead = next;

            head = head.next;
        }
        return newHead;
    }
}
