package com.aceinthedeck.strings;


/*

https://www.hackerrank.com/challenges/alternating-characters/problem

You are given a string containing characters A and B only. Your task is to change it into a string such that there are no matching
adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

For example, given the string AABAAB, remove an  A at positions 0 and 3 to make ABAB in 2 deletions.


 */

public class AlternatingCharacters {

    static int deletions(String str){

        char[] strArray = str.toCharArray();
        int deletions =0;


        char previous = strArray[0];

        for(int i=1;i<strArray.length;i++){

            if(previous==strArray[i])
            {
                deletions++;
            }
            else{
                previous = strArray[i];
            }
        }

        return  deletions;
    }
}
