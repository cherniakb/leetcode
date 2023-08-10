package com.problems;

import java.util.List;
import java.util.Objects;

public class Application {

    public static ListNode middleNode(ListNode head) {
        int middle = getLength(head) / 2;
        int iterator = 0;

        while (Objects.nonNull(head)) {
            if (iterator == middle) {
                return head;
            } else {
                head = head.next;
            }
            iterator++;
        }
        return head;
    }

    private static int getLength(ListNode head) {
        ListNode copyHead;
        copyHead = head;
        int count = 0;
        while (Objects.nonNull(copyHead)) {
            copyHead = copyHead.next;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(6))));
        ListNode listNode = middleNode(listNode2);
        System.out.println(listNode);
    }
}
