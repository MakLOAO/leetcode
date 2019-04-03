package LongestPalindromicSubstring;

import java.util.Scanner;

public class LongestPalindromicSubstringTest {

/**
 * @program: leetcode1
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-03-27 22:35
 **/
    public static void main(String... args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(s.longestPalindrome(sc.next()));
        }
    }
}
