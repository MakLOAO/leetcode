package TwoSum;

public class TwoSumTest {

/**
 * @program: leetcode1
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-03-24 20:07
 **/

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 26;
        int result[] = new int[2];
        result = Solution.twoSum2(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
