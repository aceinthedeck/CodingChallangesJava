package com.aceinthedeck.dynamicprogramming;

/*

Given a string find the longest palindrome sub sequence.

example: ABBDCACB

The longest palindrome is BCACB

Output = 5
 */

public class LongestPalindrome {


    static int count(String str, int startIndex, int endIndex){

        //base condition
        if(startIndex > endIndex){

            return 0;
        }

        //if a single character it is a palindrome.
        if(endIndex == startIndex){
            return 1;
        }

        //if first and last character are same then move one character forward from start and end
        if(str.charAt(startIndex)==str.charAt(endIndex)){

            return count(str, startIndex+1, endIndex-1)+2;

        }
        /*
        else:
        1. Move one char forward from start and run for remaining string
        2. Move one char forward from end and run for remaining string
        3. Return the maximum out of two
         */
        else{

           return Integer.max(count(str, startIndex, endIndex-1), count(str, startIndex+1, endIndex));
        }


    }
}
