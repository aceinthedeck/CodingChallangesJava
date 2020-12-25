package com.aceinthedeck.arrays;

/*


Write a function that, given an array A of N integers, returns the largest integer K > 0 such that both values K and -K exist in array A. If there is no such integer, the function should return 0.

Example 1:

Input: [3, 2, -2, 5, -3]
Output: 3
Example 2:

Input: [1, 2, 3, -4]
Output: 0

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestK {

    public static int largest(int[] array){

        int result = 0;

        Set<Integer> hashSet = new HashSet<>();

        for (int j : array) {
            hashSet.add(-j);

            if (hashSet.contains(j)) {
                result = Math.max(Math.abs(j), result);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 2, -2, 5, -3 };
        int[] nums2 = { 1, 2, 3, -4 };
        System.out.println(largest(nums1));
        System.out.println(largest(nums2));
        System.out.println("-------------------------------------");
        System.out.println(largestNum2(nums1));
        System.out.println(largestNum2(nums2));
    }


    private static int largestNum2(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int l = 0, r = nums.length -1;
        while(l < r) {
            int sum = nums[l] + nums[r];
            if(sum == 0) {
                res = Math.max(res, Math.max(nums[l], nums[r]));
                l++;
                r--;
            }
            else if(sum < 0) {
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
