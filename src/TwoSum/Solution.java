package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * @author: makaloo
 *
 * @create: 2019-03-24 20:07
 **/

    public static int[] twoSum(int[] nums, int target) {
        int i, j=0;
        loop: for(i = 0; i < nums.length-1; i++) {
            for(j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    break loop;
            }
        }
        return new int[] {i, j};
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int i;
        int temp;
        for(i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        for(i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            if(map.containsKey(temp) && map.get(temp) != i)
                return new int[] {i, map.get(temp)};
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
