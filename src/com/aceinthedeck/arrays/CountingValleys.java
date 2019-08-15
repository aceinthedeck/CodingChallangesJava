package com.aceinthedeck.arrays;


/*

https://www.hackerrank.com/challenges/counting-valleys/

Count the number of valleys hiked by a hiker. Hiker can move up or down (denoted by U or D)
U is 1 unit up the sea level and D is one unit down the sea level.

- A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level
and ending with a step down to sea level.
- A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level
and ending with a step up to sea level.

for example

s = 'DDUUUUDD'

enters 2 unit valley deep then climbs a mountain of 2 unit high then returns to sea level.

Sample input

8
UDDDUDUU

Output
1

_/\      _
   \    /
    \/\/


 */


public class CountingValleys {

    static int countingValleys(int n, String s) {

        int level = 0;
        int numValleys = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'U') {
                level++;
                if (level == 0) {
                    numValleys++;
                }
            } else if (ch == 'D') {
                level--;
            }
        }
        return numValleys;
    }
}
