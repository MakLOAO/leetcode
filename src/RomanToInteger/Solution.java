package RomanToInteger;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * @author: makaloo
 *
 * @create: 2019-04-05 12:10
 **/
    public int romanToInt(String s) {
        int result = 0;
        int last = 1000;
        for (int i = 0; i < s.length(); i++) {
            int now = getValue(s.charAt(i));
            if (now > last) result = result - 2 * last;
            result += now;
            last = now;
        }
        return result;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
