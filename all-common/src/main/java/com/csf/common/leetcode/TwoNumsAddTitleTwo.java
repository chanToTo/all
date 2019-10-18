package com.csf.common.leetcode;

import java.util.TreeMap;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class TwoNumsAddTitleTwo {
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        listNode11.next = new ListNode(3);
        ListNode listNode12 = listNode11.next;
        listNode12.next = new ListNode(4);

        ListNode listNode21 = new ListNode(8);
        listNode21.next = new ListNode(4);
        ListNode listNode22 = listNode21.next;
        listNode22.next = new ListNode(4);
        TwoNumsAddTitleTwo twoNumsAddTitleTwo = new TwoNumsAddTitleTwo();
        System.out.println(twoNumsAddTitleTwo.addTwoNumbers(listNode11, listNode21));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        int carry = 0;
        while (l1 != null || l2 != null) {
            carry /= 10;
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            dummy.next = new ListNode(carry % 10);
            dummy = dummy.next;
        }

        if (carry / 10 == 1) {
            dummy.next = new ListNode(1);
        }
        return ans.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
