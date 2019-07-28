package com.aceinthedeck;


//Given a string test whether it is a palindrome

public class Palindrome {

    public static boolean palindrome(String str){

        String reversed = ReverseString.reverse(str);

        if(str.length()==0 || str ==null){
            return false;
        }

        if(str.equals(reversed)){
            return true;
        }

        else{
            return false;
        }
    }
}
