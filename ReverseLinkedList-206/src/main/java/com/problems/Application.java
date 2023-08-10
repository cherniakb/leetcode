package com.problems;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Application {
    public static ListNode reverseList(ListNode head) {
        ListNode reversedList = new ListNode();
        if (isNull(head)) {
            return null;
        }
        int counter = 0;
        while (nonNull(head)) {
            ListNode tempNode = new ListNode(head.val);
            if (counter == 0) {
                reversedList = tempNode;
            } else {
                tempNode.next = reversedList;
                reversedList = tempNode;
            }
            head = head.next;
            counter++;
        }
        return reversedList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(1))));
        ListNode listNode1 = reverseList(listNode);
        System.out.println(listNode1);
    }
}
