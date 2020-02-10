package com.csf.common.leetcode;

import java.util.Stack;

public class ReverseLinkedListTitleSixtyOne {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        ListNode listNode = new ListNode(0);
        listNode.val = arr.length > 0 ? arr[0] : -1;
        for (int i = 1; i < arr.length; i++) {
            insertLinkedList(arr[i], listNode);
        }
        ListNode listNode1 = rotateRight(listNode, 2000000000);
        System.out.println(listNode1);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        ListNode tmpNode = head;
        while (tmpNode != null) {
            length++;
            tmpNode = tmpNode.next;
        }
        ListNode newNode = head;
        k = k % length;
        while (k > 0) {
            k--;
            Stack stack = new Stack();
            reverse(newNode, stack);
            ListNode stackNode = (ListNode) stack.pop();
            stackNode.next = newNode;
            newNode = stackNode;
        }
        return newNode;
    }

    private static ListNode reverse(ListNode newNode, Stack stack) {
        while (newNode.next != null) {
            if (newNode.next.next == null) {
                stack.push(newNode.next);
                newNode.next = null;
                return reverse(newNode, stack);
            } else {
                return reverse(newNode.next, stack);
            }
        }
        return newNode;
    }
    public static void insertLinkedList(int value, ListNode listNode) {
        if (listNode.next == null) {
            listNode.next = new ListNode(value);
        } else {
            insertLinkedList(value, listNode.next);
        }
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
