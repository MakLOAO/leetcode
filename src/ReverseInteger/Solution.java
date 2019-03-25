package ReverseInteger;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Given a 32-bit signed integer, reverse digits of an integer.
 *
 * @author: makaloo
 *
 * @create: 2019-03-24 20:45
 **/
    public static int reverse(int x) {
        // Assume we are dealing with an environment which could only
        // store integers within the 32-bit signed integer range: [−231,  231 − 1].
        // For the purpose of this problem, assume that your function returns 0
        // when the reversed integer overflows.
        int xCopy = x, result = 0, temp;
        while(xCopy != 0) {
            temp = xCopy % 10;
            xCopy /= 10;
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            // I suppose that the code after '||' is unnecessary
            result = result * 10 + temp;
        }
        return result;
    }
}
