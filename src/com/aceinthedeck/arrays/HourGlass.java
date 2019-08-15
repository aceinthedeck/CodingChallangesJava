package com.aceinthedeck.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*


https://www.hackerrank.com/challenges/2d-array/problem

Given a 6X6 array. We define an hourglass in A to be a subset of values with indices
falling in the pattern

a b c
  d
e f g

There are 16 hourglasses in a 6X6 array and and an hourglass sum is the sum of an hourglass' values.
Calculate the hourglass sum for every hourglass, then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
We calculate the following 16 hourglass values:

-63, -34, -9, 12,
-10, 0, 28, 23,
-27, -11, -2, 10,
9, 17, 25, 18
Our highest hourglass value is 28 from the hourglass:

0 4 3
  1
8 6 6
 */


public class HourGlass {


    static int hourglassSum(int[][] arr) {

        List<Integer> sum = new ArrayList();
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                sum.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }

        }
        return Collections.max(sum);
    }

}
