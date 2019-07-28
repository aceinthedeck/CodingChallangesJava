package com.aceinthedeck;

/*

  Prints the number from 1 to n. However, if a number is divisible by 3
  print fizz. If its divisible by 5 print buzz. If it is divisible by both 3 and 5
  print fizzbuzz
 */

public class FizzBuzz {

    public static void print(int n){

        if(n<=0){
            System.out.println("Error");
        }

        for(int i=1;i<=n;i++){

            if (i%15==0){
                System.out.println("FizzBuzz");
            }

            else if (i%5==0){
                System.out.println("Buzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }

            else // print the numbers
                System.out.println(i);

        }

    }
}
