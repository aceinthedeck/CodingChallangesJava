package com.aceinthedeck.dynamicprogramming;


/*

http://www.techiedelight.com/longest-common-subsequence/

Given two strings find the longest common substring

Example
A: ABCBDAB
B: BDCABA

The length is 4

LCS are BDAB, BCAB and BCBA

 */

public class LongestCommonSubsequence {



    static int count(String s1, String s2, int len1, int len2){

        int[][] map = new int[len1][len2];

        if(len1==0 || len2 == 0){
            return 0;
        }

        if(map[len1-1][len2-1]==0){

            if(s1.charAt(len1-1) == s2.charAt(len2-1)){
                return count(s1, s2, len1-1, len2-1) +1;
            }

            else{

                return  Integer.max(count(s1, s2, len1, len2-1), count(s1, s2, len1-1, len2));

            }
        }
        else {

            return map[len1-1][len2-1];
        }

    }


}
