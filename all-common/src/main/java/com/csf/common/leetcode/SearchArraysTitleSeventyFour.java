package com.csf.common.leetcode;

/**
 * 查找矩阵是否存在某个数据
 */
public class SearchArraysTitleSeventyFour {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(doAction(arr,  0, 0, arr.length));
    }

    private static boolean doAction(int[][] arr, int num, int start, int end) {
        if (arr.length == 0 || arr[0].length == 0) return false;
        if (num == arr[0][0]) return true;
        if (num == arr[arr.length - 1][0]) return true;
        int middle = (start + end) / 2;
        if (num < arr[middle][0]) {
            if (num < arr[0][0]) return false;
            if (num > arr[middle-1][0]) {
                boolean flag = true;
                for (int i = 0; i < arr[middle-1].length ; i++) {
                    if (num == arr[middle - 1][i])  return true;
                }
                if (flag) return false;
            }
            return doAction(arr, num, start, middle);
        } else if (num > arr[middle][0] && middle + 1 <= end){
            for (int i = 0; i < arr[middle].length; i++) {
                if (num == arr[middle][i]){
                    System.out.println("第 " + middle + "行 ； 第 " + i + "列" );
                    return true;
                }
            }
            if (middle == arr.length - 1 || middle == 0)  return false;
            return doAction(arr, num, middle, end);
        } else if (num == arr[middle][0]){
            System.out.println("第 " + middle + "行 ; 第 0 列");
            return true;
        }
        return false;
    }
}
