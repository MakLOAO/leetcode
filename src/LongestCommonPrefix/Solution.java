package LongestCommonPrefix;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Write a function to find the longest common prefix string amongst an array of strings.  If there is no common prefix, return an empty string "".
 *
 * @author: makaloo
 *
 * @create: 2019-04-05 16:46
 **/
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int i, j;
        for (j = 0; j < strs[0].length(); j++) {
            for (i = 0; i < strs.length; i++) {
                if (j == strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }

    // divide and conquer technique
    // time complexity: O(m * n)
    // space complexity: O(mlogn)
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r)
            return strs[l];
        int mid = (l + r) / 2;
        String lcpLeft = longestCommonPrefix(strs, l, mid);
        String lcpRight = longestCommonPrefix(strs, mid + 1, r);
        return commonPrefix(lcpLeft, lcpRight);
    }

    private String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }

    // Binary Search
    // time complexity: O(S*logn) S is the sum of all characters in all strings
    // space complexity: O(1)
    // 能把二分查找用在这，真的强啊！
    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(str.length(), minLen);
        int low = 1;
        int high =  minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (String str : strs)
            if (!str.startsWith(str1))
                return false;
        return true;
    }
}
