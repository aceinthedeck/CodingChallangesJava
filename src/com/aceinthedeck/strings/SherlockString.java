package com.aceinthedeck.strings;

/*


Sherlock considers a string to be valid if all characters of the string appear the same number of times.
It is also valid if he can remove just one character at one index in the string, and the remaining characters will occur
the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.

Example

abcc is valid
if you remove one c every character has same frequency.


 */


import java.util.Arrays;

public class SherlockString {


    static String isValid(String s) {
        final String GOOD = "YES";
        final String BAD = "NO";

        if(s.isEmpty()) return BAD;
        if(s.length() <= 3) return GOOD;

        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++){
            letters[s.charAt(i) - 'a']++;
        }
        Arrays.sort(letters);
        int i=0;
        while(letters[i]==0){
            i++;
        }
        //System.out.println(Arrays.toString(letters));
        int min = letters[i];   //the smallest frequency of some letter
        int max = letters[25]; // the largest frequency of some letter
        String ret = BAD;
        if(min == max) ret = GOOD;
        else{
            // remove one letter at higher frequency or the lower frequency
            if(((max - min == 1) && (max > letters[24])) ||
                    (min == 1) && (letters[i+1] == max))
                ret = GOOD;
        }
        return ret;
    }

}
