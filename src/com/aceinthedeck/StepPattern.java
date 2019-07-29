package com.aceinthedeck;

/*

Write a program that accepts a number n and prints the following

for number 3

*
**
***

 */

public class StepPattern {


    public static  void print(int n){

        for(int i=0; i<n;i++){

            for (int j = 0; j <=i ; j++) {

                System.out.print('*');

            }
            System.out.println();
        }
    }

}
