package IntegerToRoman;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * @author: makaloo
 *
 * @create: 2019-04-05 11:57
 **/
    public String intToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[num / 100 % 10] + X[num / 10 % 10] + I[num % 10];
    }
}
