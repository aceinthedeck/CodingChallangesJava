package com.aceinthedeck;

//Given a string find out maximum recurring character
// e.g. for string aaabbbb it should return b
public class MaxChar {


    public static String maxChar(String str){

        int[] charMap = new int[(int)'z'-(int)'a'];

        for(int i=0; i<str.length(); i++){

            charMap[(int)str.charAt(i)-(int)'a']++;
        }

        int max =0;
        int maximumOccuringChar = 0;
        for(int i=0;i<charMap.length;i++){

            if(charMap[i]>max){
                max= charMap[i];
                maximumOccuringChar = i+(int)'a';
            }

        }

        if(maximumOccuringChar==0){
            return "No character found";
        }

        return String.valueOf((char)maximumOccuringChar);

    }
}
