package LongestCommonPrefix;

public class LongestCommonPrefixTest {

/**
 * @program: leetcode1
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-04-05 17:25
 **/
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "fly"};
        Solution s = new Solution();
        String longest = s.longestCommonPrefix(strs);
        System.out.println(longest);
    }
}
