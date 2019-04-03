package PalindromeNumber;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *                  Input: 121              -121                10
 *                  Output: true            false               false
 *                  Follow up: Could you solve it without converting the integer to a string?
 *
 * @author: makaloo
 *
 * @create: 2019-03-27 21:19
 **/
    public boolean isPalindrome(int x) {
        Stack<Integer> stack = new Stack<>();
        int xCopy = x, ans = 0, i = 1;
        if (x < 0) return false;
        while (xCopy != 0) {
            stack.push(xCopy % 10);
            xCopy = xCopy / 10;
        }
        while (!stack.empty()) {
            ans += stack.pop() * i;
            i *= 10;
        }
        return x == ans;
    }

    public boolean isPalindrome1(int x) {
        Deque<Integer> deque = new ArrayDeque<>();
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        while (x != 0) {
            deque.add(x % 10);
            x /= 10;
        }
        while (!deque.isEmpty()) {
            int z = deque.getFirst();
            int y = deque.getLast();
            if (z != y) return false;
            deque.removeFirst();
            if (!deque.isEmpty())
                deque.removeLast();
        }
        return true;
    }

    // 更好的答案，时间复杂度O(logn)，空间复杂度O(1)
    public boolean isPalindrome2(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}
