package PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumberTest {

/**
 * @program: leetcode1
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-03-27 21:42
 **/
    public static void main(String... args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(s.isPalindrome1(sc.nextInt()));
        }
    }
}
