package com.aceinthedeck.strings;

/*

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

 */
public class LongestCommonPrefix {

    public static String prefix(String[] strs){

        if(strs==null || strs.length ==0){
            return "";
        }

        for(int i=0; i<strs[0].length(); i++){

            char c = strs[0].charAt(i);

            for(int j=1; j<strs.length; j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=c){
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];

    }

    public static void main(String[] args){

        String[] strs = {"abc", "abd"};
        System.out.println(LongestCommonPrefix.prefix(strs));

    }

}
