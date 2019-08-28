package com.aceinthedeck.strings;

/*

https://www.hackerrank.com/challenges/two-strings/problem

Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring a. The words "be" and "cat" do not share a substring.



 */

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {

        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){

            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1){
                return "YES";
            }

        }
        return "NO";
    }
}
