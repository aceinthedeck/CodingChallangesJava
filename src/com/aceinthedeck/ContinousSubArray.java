package com.aceinthedeck;

import java.util.Arrays;

/*

Given an array and a number.
Find a continuous sub array with sum of elements equal to the given number.

Example

{1, 2, 3, 4, 5} and sum 7

it should return {3, 4}
 */

public class ContinousSubArray {



    public static int[] findSubarray(int[] array, int sum) {
        int windowSum = 0, i = 0, j = 0;

        while (i < array.length) {
            while (j < array.length && windowSum < sum) {
                windowSum += array[j++];
            }

            if (windowSum == sum) {
                return Arrays.copyOfRange(array, i, j);
            }

            windowSum -= array[i++];
        }

        return null;
    }
}
