package com.aceinthedeck;


//Given a string test whether it is a palindrome

public class Palindrome {
    public static boolean palindrome(String str){
        return str.equals(ReverseString.reverse(str));       
    }
}
