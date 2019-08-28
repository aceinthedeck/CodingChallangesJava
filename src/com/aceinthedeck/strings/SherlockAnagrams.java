package com.aceinthedeck.strings;

import java.util.ArrayList;


/*

https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem

Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.

For example s=mom , the list of all anagrammatic pairs is [m, m], [mo, om].

 */



public class SherlockAnagrams {


    static int count(String s) {

        ArrayList<String> list = new ArrayList<>();
        int len = s.length();

        int counter =0;

        for(int i=0; i<len;i++) {
            for(int j=1; j<=len-i; j++) {
                String subString = s.substring(i, i+j);
                list.add(subString);
            }
        }

        for(int j=0; j<list.size();j++) {

            String element = list.get(j);

            for(int k=j+1;k<list.size();k++) {

                if(isAnagram(list.get(k),element)) {

                    counter++;
                }
            }

        }

        return counter;

    }

 static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
        return false;
        }
        int[] lettermap = new int[26];
        for(int j=0; j<a.length(); j++){
        char ch = a.charAt(j);
        lettermap[ch - 'a']++;
        ch = b.charAt(j);
        lettermap[ch - 'a']--;
        }

        for(int j=0; j<lettermap.length; j++){
        if(lettermap[j] != 0){
        return false;
        }
        }
        return true;
        }

}
