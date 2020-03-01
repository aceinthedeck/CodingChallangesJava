package com.aceinthedeck.arrays;

/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

https://leetcode.com/problems/two-sum/

 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        int i = 0;
        int j;
        int result[] = {0, 0};
        int first;
        boolean found = false;

        while(i<nums.length){
            first = nums[i];
            result[0]= i;
            j=i+1;
            while(j<nums.length){

                if(nums[j]+first==target){
                    result[1] = j;
                    return result;
                }
                j++;
            }
            i++;
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumHashMap(int[] nums, int target){

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)){

                return new int[]{hashMap.get(complement), i};

            }
            hashMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution");
    }


}
