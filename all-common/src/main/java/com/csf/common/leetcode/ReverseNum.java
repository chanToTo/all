package com.csf.common.leetcode;

/**
 * @author orangeC
 * @date 2019/10/14 19:06
 * @desc
 */
public class ReverseNum {
    public static void main(String[] args) {
        ReverseNum reverseNum = new ReverseNum();
        int num = reverseNum.reverse(123);
        System.out.println(num);
    }

    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            temp *= 10;
            temp += x % 10;
            x /= 10;
        }
        if (temp < Integer.MIN_VALUE || temp > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) temp;
    }
}
