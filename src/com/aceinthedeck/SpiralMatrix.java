package com.aceinthedeck;

/*

write a function that accepts a number n
and returns a NxN sprial matrix

matrix(3)

1 2 3
8 9 4
7 6 5

assume that n>0;

 */

public class SpiralMatrix {

    public static int[][] create(int n){

        int[][] spiral = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int counter = 1;

        while(top<=bottom && left<=right){

            //left to right
            for(int i=left; i<=right; i++){

                spiral[left][i] = counter++;
            }

            top++;

            //up to down

            for (int i = top; i<=bottom;i++){
                spiral[i][right] = counter++;
            }

            right--;

            //right to left
            for(int i=right; i>=left; i--){
                spiral[bottom][i] = counter++;
            }

            bottom--;

            //bottom to top
            for(int i=bottom; i>=top;i--){

                spiral[i][left] = counter++;

            }

            left++;

        }


        return spiral;

    }

}
