package com.aceinthedeck;


/*

Given a number n print a pattern

Example for number 4. The stars increase in step of 2

   *
  ***
 *****
*******

 */

public class PyramidPattern {


    public static void print(int n){

        int spaces = n-1;
        int numberOfStars = 1;

        for(int i=0; i<n;i++){

            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0; j<numberOfStars;j++){
                System.out.print("*");
            }
            spaces--;
            numberOfStars+=2;
            System.out.println();
        }
    }
}
