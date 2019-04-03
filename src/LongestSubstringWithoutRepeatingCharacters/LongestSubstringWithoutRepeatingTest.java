package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingTest {

/**
 * @program: leetcode1
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-03-26 09:54
 **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        int length;
        while (sc.hasNext()) {
            String s = sc.next();
            length = solution.lengthOfLongestSubstring2(s);
            System.out.println("length is " + length);
        }
    }
}
