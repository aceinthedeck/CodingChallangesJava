package com.aceinthedeck.arrays;


/*

John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching
colors there are.

For example, there are 7 socks with colors [1, 2, 1, 2, 1, 3, 2].
There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color.
The number of pairs is 2.

 */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SockMerchant {

    public static int getPairs(int n, int[] array){

        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(array[i])) {
                colors.add(array[i]);
            } else {
                pairs++;
                colors.remove(array[i]);
            }
        }

       return pairs;
    }
}
