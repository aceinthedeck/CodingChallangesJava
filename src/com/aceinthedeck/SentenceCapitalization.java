package com.aceinthedeck;


/*

Given a string, capitalize every word in the sentence

Example - a quick brown fox
should return A Quick Brown Fox
 */

public class SentenceCapitalization {

    public static String capitalize(String sentence){

        String output = "";

        if(sentence.length()==0){
            return output;
        }

        String[] words = sentence.split(" ");

        for (int i = 0; i <words.length ; i++) {

            words[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            output += words[i] + " ";
        }

        return output.trim();
    }
}
