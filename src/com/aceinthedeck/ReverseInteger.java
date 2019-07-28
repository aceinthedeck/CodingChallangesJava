package com.aceinthedeck;

//Given an integer return and integer that is reverse of the integer.
public class ReverseInteger {


    public static int reverse(int number) {

        int reverse = 0;

        if(number<10){
            return number;
        }

        while (number / 10 != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        return reverse;
    }
}
