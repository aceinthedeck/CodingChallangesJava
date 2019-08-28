package com.aceinthedeck.strings;
/*

https://www.hackerrank.com/challenges/special-palindrome-again/problem

A string is said to be a special string if either of two conditions is met:

- All of the characters are the same, e.g. aaa.
- All characters except the middle one are the same, e.g. aadaa.
A special substring is any substring of a string which meets one of those criteria. Given a string,
determine how many special substrings can be formed from it.

Sample input
asasd

Output
7

strings {a, s, a, s, d, asa, sas}

 */


public class SpecialStringAgain {

    static long count(String s)
    {
        long retVal = s.length();

        for (int i = 0; i < s.length(); i++)
        {
            var startChar = s.charAt(i);
            int diffCharIdx = -1;
            for (int j = i + 1; j < s.length(); j++)
            {
                var currChar = s.charAt(j);
                if (startChar == currChar)
                {
                    if ((diffCharIdx == -1) ||
                            (j - diffCharIdx) == (diffCharIdx - i))
                        retVal++;
                }
                else
                {
                    if (diffCharIdx == -1)
                        diffCharIdx = j;
                    else
                        break;
                }
            }
        }
        return retVal;
    }
}
