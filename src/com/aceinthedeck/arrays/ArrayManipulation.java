package com.aceinthedeck.arrays;

/*

Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

For example, the length of your array of zeros n =10 . Your list of queries is as follows:

a b k
1 5 3
4 8 7
6 9 1

index
     1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]

The largest value is 10. So the output should be 10

 */


public class ArrayManipulation {

    public static long max(int n, int[][] queries)
    {

        long[] array = new long[n+1];

        for(int i=0; i<queries.length;i++){

            array[queries[i][0]-1] += queries[i][2];
            array[queries[i][1]] -= queries[i][2];

        }

        long max =0;
        long sum =0;

        for(int i=0; i<n; i++){

            sum += array[i];

            max = Math.max(sum, max);

        }

        return max;
    }
}
