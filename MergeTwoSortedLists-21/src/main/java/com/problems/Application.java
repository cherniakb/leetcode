package com.problems;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode tail;
        if (Objects.isNull(list1)) {
            return list2;
        }
        if (Objects.isNull(list2)) {
            return list1;
        }


        if (list1.val < list2.val) {
            head = list1;
            tail = mergeTwoLists(list1.next, list2);
        } else {
            head = list2;
            tail = mergeTwoLists(list1, list2.next);
        }

        head.next = tail;
        return head;
    }

    public static void main(String[] args) throws Exception {
        ListNode listNode1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode listNode2 = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(6))));

        System.out.println("12345".charAt(6));

        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        System.out.println(listNode);
    }
}
