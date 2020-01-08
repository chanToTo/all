package com.csf.common.testDemo;

public class TestRecurrenceSum {

    /*public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int num = doAction(arr);
        System.out.println(num);
    }

    private static int doAction(int[] arr) {
        int middle = arr.length/2;
        int result = 0;
        int startIndex = 0;
        if (middle > 2) {
            int[] arr1 = Arrays.copyOfRange(arr, startIndex, middle);
            int num1 = doAction(arr1);
            int[] arr2 = Arrays.copyOfRange(arr, middle, arr.length);
            int num2 = doAction(arr2);
            return num1 + num2;
        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }*/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int num = xcAction(arr,0, arr.length - 1);
        System.out.println(num);
    }
    private static int xcAction (int[] arr,int start,int end) {
        if(start == end) {
            return arr[start];
        }
        int divide = (start + end) / 2;
        int num1 = xcAction(arr, start, divide);
        int num2 = xcAction(arr, divide + 1, end);
        return num1 + num2;
    }
}
