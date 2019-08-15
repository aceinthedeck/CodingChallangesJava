package com.aceinthedeck.arrays;

/*

https://www.hackerrank.com/challenges/minimum-swaps-2


You are given an unordered array consisting of consecutive integers [1, 2, 3, ..., n] without any duplicates.
You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

Sample Input
4 3 1 2

Output
3

Swap 4, 1 -> [1,3,4,2]
Swap 3, 2 -> [1,2,4,3]
Swap 4, 3 -> [1,2,4,3]

 */


public class MinimumSwaps2 {

    static int count(int[] array){

        int count= 0;

        for(int i = 0; i<array.length;){

            if(array[i]!=i+1){
                int temp = array[array[i]-1];
                array[array[i]-1] = array[i];
                array[i] =  temp;
                count++;
            }
            else{
                i++;
            }


        }

        return count;
    }

}
