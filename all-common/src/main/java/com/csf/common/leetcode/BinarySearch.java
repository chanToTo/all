package com.csf.common.leetcode;

import java.util.Scanner;

/**
 * 二分查找法 递归查找数字
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{7,8,12,22,25,29,45,95,101,152,169};
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = search(arr, 0, arr.length-1, num);
        System.out.println(result);
    }

    public static int search(int[] arr, int start, int end, int num) {

        int middle = (start + end) / 2;
        if (num == arr[middle]) {
            return middle;
        }
        if (start == end) {
            return -1;
        }
        if (num < arr[middle]) {
            return search(arr, start, middle, num);
        }
        return search(arr, middle + 1, end, num);

    }
}
