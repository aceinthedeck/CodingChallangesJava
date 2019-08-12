package com.aceinthedeck;

/*

Given an array of distinct integers.
The task is to count all the triplets such that sum of two elements equals the third element.

{1, 5, 3, 2}

should print 2 as 3+2 =5 and 2+1 =3

*/

import java.util.HashMap;

public class FindTriplets {

    public static int process(int[] array){

        HashMap<Integer, Integer> map = new HashMap<>();

        int count =0;

        for (int i = 0; i < array.length ; i++) {
            map.put(array[i], array[i]);
        }

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(map.get(array[i]+array[j])!=null){
                    count++;
                }
            }
        }

        return count;
    }

}
