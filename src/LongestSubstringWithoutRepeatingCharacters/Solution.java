package LongestSubstringWithoutRepeatingCharacters;

import AddTwoNumbers.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Given a string, find the length of the longest substring without repeating characters.
 *
 * @author: makaloo
 *
 * @create: 2019-03-26 09:52
 **/
    /*
    * 自我总结：2019/03/26 这题我是想用HashMap来做的（因为不知道有HashSet这个东西233），但是想了好久都没想出来，所以就去瞄了一眼答案，
    * 一看答案用sliding window，我傻了，真是一个很好的方法，学到了学到了！
    * */
    /*public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                maxLength = (maxLength > map.size()) ? maxLength : map.size();
                map.clear();
            }
            map.put(s.charAt(i), i);
        }
        return maxLength;
    }*/

    // 使用HashSet的Sliding Window方法
    // 算法思想：当set中不存在s.charAt(j)时，就添加，否则就删除，每次添加的时候计算sliding window的长度
    public int lengthOfLongestSubstring1(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0; // i指向舍弃的下一个位标，j指向添加到set的下一位标
        int ans = 0;
        while (i < s.length() && j < s.length()){
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    // 使用HashMap的Sliding Window方法，不用删除Map之前的元素，只需忽略它们
    // 算法思想：map保存键为s.charAt(j)，值为其位标+1，每次判断map中是否存在s.charAt(j)，若存在，则计算出重复元素的最大值
    // 然后无论存不存在，都计算sliding window的长度，然后把s.charAt(j)存进map（若存在则更新值）
    // map的作用是保存该char在String中的最新(后)一个位置的位标的下一位标
    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>(); // 键为要添加的元素，值为添加的元素的下一位标
        int i, j; // i: 忽略的元素的下一位标 j: 添加的元素的当前位标
        int ans = 0;
        for(i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                // 当有相同值的时候，令i位标移动到前一个该值的下一位标
                // 如果i = map.get(s.charAt(j))，则无法应付s="abba"的情况
                // 必须取所有重复元素的最后一个的下一位标
                i = Math.max(i, map.get(s.charAt(j)));
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1); // store the next indices
        }
        return ans;
    }
}
