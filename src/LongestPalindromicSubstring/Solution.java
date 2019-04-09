package LongestPalindromicSubstring;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 *                      Input: "babad"
 *                      Output: "bab"
 *                      Note: "aba" is also a valid answer.
 *
 *
 * @author: makaloo
 *
 * @create: 2019-03-27 21:57
 **/
    public String longestPalindrome(String s) {
            String result = "", temp;
            for (int i = 0; i < s.length(); i++) {
                temp = searchPalindrome(s, i, i);
                result = result.length() > temp.length() ? result : temp;
                temp = searchPalindrome(s, i, i + 1);
                result = result.length() > temp.length() ? result : temp;
            }
            return result;
        }

        private String searchPalindrome(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--; right++;
            }
        left++; right--;
        // s.substring(beginIndex, endIndex),beginIndex is inclusive, endIndex is exclusive, [beginIndex, endIndex)
        return s.substring(left, right + 1);
    }


    // 答案的解法，使用长度返回会比子字串返回要快，大概是substring时间复杂度的问题
    public String longestPalindrome1(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}