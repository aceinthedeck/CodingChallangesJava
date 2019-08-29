package com.aceinthedeck.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

Given an array and chunk size, divide the array into subarrays
with each subarray is of length chunk size;
e.g. [1,2,3,4] chunk size 2 gives [1,2],[3,4]

 */

public class ArrayChunk {

    public static List<int[]> chunk(int[] array, int chunkSize){

        ArrayList<int[]> chunkedList = new ArrayList<>();

        for(int i=0;i<array.length;i=i+chunkSize){

            if(i+chunkSize<array.length){

                chunkedList.add(Arrays.copyOfRange(array, i, i+chunkSize));

            }
            else{
                chunkedList.add(Arrays.copyOfRange(array, i, array.length));
            }
        }

        return chunkedList;
    }
}
