package com.aceinthedeck.arrays;

/*

https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2] .

Given an array a of n integers and a number, d, perform d left rotations on the array.
Return the updated array to be printed as a single line of space-separated integers.

*/

public class RotateLeft {


    static int[] rotate(int[] a, int d) {
        int n = a.length;
        if (d >= n) {
            d = d % n;
        }

        if (d == 0) return a;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            if (i + d < n) {
                temp[i] = a[i + d];
            } else {
                temp[i] = a[(i +d) - n];
            }
        }
        return temp;
    }
}
