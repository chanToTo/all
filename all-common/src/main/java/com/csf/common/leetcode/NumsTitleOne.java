package com.csf.common.leetcode;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @desc 两数之和
 */
public class NumsTitleOne {
    public static void main(String[] args) {
        System.out.println("开始：" + System.currentTimeMillis());
        int[] nums = new int[]{12,34,20,9,50,60,20,50};
        NumsTitleOne numsTitleOne = new NumsTitleOne();
        int[] targetInt = numsTitleOne.twoSum(nums,80);
        System.out.println(targetInt[0] + "," +  targetInt[1]);
        System.out.println("结束：" + System.currentTimeMillis());
    }
    /*public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[] {(Integer)map.get(nums[i]), i};
            }
            map.put(target-nums[i], i);
        }
        return new int[] {-1, -1};
    }*/

    /*public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return null;
    }*/
    public int[] twoSum(int[] nums, int target) {
        int count = 0;
        while(count<nums.length){
            for(int i=count+1;i<nums.length;i++){
                if(target == nums[count] + nums[i]){
                    return new int []{count,i};
                }
            }
            count++;
        }
        return null;
    }
}
