package com.csf.common.leetcode;

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
