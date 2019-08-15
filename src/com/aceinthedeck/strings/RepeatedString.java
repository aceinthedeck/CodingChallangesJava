package com.aceinthedeck.strings;


/*

https://www.hackerrank.com/challenges/repeated-string/problem

Lilah has a string s, of lowercase English letters that she repeated infinitely many times.

Given an integer n, find and print the number of letter a's in the first  letters of Lilah's infinite string.

For example, if the string s = 'abcac'  and n=10 the substring we consider is abcacabcac , the first 10
characters of her infinite string. There are  occurrences of a in the substring.

Sample input

aba
10

Sample output
7


 */

public class RepeatedString {

    static long count(String s, long n){

        long length = s.length();
        long countOfA = 0;
        long totalCount = 0;
        int lastCount = 0;

        long remainingLength = n % length;



        for(int i=0;i<length;i++){

            if(s.charAt(i)=='a'){
                countOfA++;

                if(i<remainingLength){
                    lastCount++;
                }
            }

        }

        totalCount = (n/length)*countOfA + lastCount;
        return totalCount;
    }
}
