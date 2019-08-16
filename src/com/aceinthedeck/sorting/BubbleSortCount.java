package com.aceinthedeck.sorting;


/*

https://www.hackerrank.com/challenges/ctci-bubble-sort/problem

For a bubble sort print the following

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3

Number of swaps required to sort the array
First element after sorting
Last element after sorting

 */

public class BubbleSortCount {


    static void countSwaps(int[] a){

        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in " + count+" swaps.");
        System.out.println("First element: "+ a[0]);
        System.out.println("Last element: "+ a[n-1]);
    }
}
