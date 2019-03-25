package ReverseInteger;

public class ReverseIntegerTest {

/**
 * @program: leetcode1
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-03-24 21:28
 **/
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int x = 10345;
        int y = Solution.reverse(x);
        System.out.println(y);
        x = -12340;
        y = Solution.reverse(x);
        System.out.println(y);
        x = 2147483647;
        y = Solution.reverse(x);
        System.out.println(y);
        x = -2147483648;
        y = Solution.reverse(x);
        System.out.println(y);
    }
}
