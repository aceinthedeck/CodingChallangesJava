package com.aceinthedeck;


/*
Given two strings find out whether they are anagrams
of each other.
 */

import java.util.Arrays;

public class Anagram {

    public static boolean anagramBySorting(String string1, String string2){

        if(string1.length()!=string2.length()){

            return false;
        }

        char[] charString1 =  string1.toCharArray();
        char[] charString2 = string2.toCharArray();
        Arrays.sort(charString1);
        Arrays.sort(charString2);

        for (int i = 0; i < charString1.length; i++) {

            if(charString1[i]!=charString2[i]){
                return false;
            }

        }

        return true;
    }

    public static boolean anagramByStorage(String string1, String string2){

        int[] count = new int[256];
        Arrays.fill(count,0);

        if(string1.length()!=string2.length()){
            return  false;
        }

        for (int i = 0; i <string1.length() ; i++) {
            count[(int)string1.charAt(i)]++;
            count[(int)string2.charAt(i)]--;
        }

        for (int i = 0; i < count.length ; i++) {

            if(count[i]!=0){
                return false;
            }
        }

        return true;
    }
}
