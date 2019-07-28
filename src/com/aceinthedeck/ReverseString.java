package com.aceinthedeck;


//Given a string, return a new string with reversed order of characters

public class ReverseString {

    public static String reverse(String normalString){

        String reversedString="";

        for (int i = normalString.length()-1; i >=0 ; i--) {

            reversedString += normalString.charAt(i);
        }
        return reversedString;
    }

}
