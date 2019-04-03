package AddTwoNumbers;

public class Solution {

/**
 * @program: leetcode1
 *
 * @description: You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * @author: makaloo
 *
 * @create: 2019-03-25 22:10
 **/
    // You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    // Input:      (2 -> 4 -> 3) + (5 -> 6 -> 4)
    // Output:      7 -> 0 -> 8
    // Explanation: 342 + 465 = 807.
    // input: (9 -> 8) + (1) output: (0 -> 9)           input: (5) + (5) output: (0 -> 1)
    // input: (1) + (9 -> 9) output: (0 -> 0 -> 1)

    /** 
    * @Description: my solution is complex, the addTwoNumbers2 function is the leetcode solution
    * @Param: [l1, l2]
    * @return: AddTwoNumbers.ListNode
    * @Author: makaloo
    * @Date: 2019/3/26
    */ 
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p = pHead, pe;
        int result, carry = 0;
        while(p1 != null && p2 != null) {
            result = p1.val + p2.val;
            pe = new ListNode((result + carry) % 10);
            if(result + carry >= 10) {
                carry = 1;
            } else
                carry = 0;
            p.next = pe;
            p = pe;
            p1 = p1.next; p2 = p2.next;
            if(p1 == null && p2 == null && carry == 1) {
                pe = new ListNode(carry);
                p.next = pe;
            }
        }
        while (p1 != null) {
            pe = new ListNode((p1.val + carry) % 10);
            if(p1.val + carry >= 10) carry = 1;
            else carry = 0;
            p.next = pe;
            p = pe;
            p1 = p1.next;
        }
        while (p2 != null) {
            pe = new ListNode((p2.val + carry) % 10);
            if(p2.val + carry >= 10) carry = 1;
            else carry = 0;
            p.next = pe;
            p = pe;
            p2 = p2.next;
        }
        if(carry == 1) {
            pe = new ListNode(carry);
            p.next = pe;
        }
        pHead = pHead.next;
        return pHead;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode pHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = pHead;
        int carry = 0;
        while (p != null || q != null) {
            int i = (p != null) ? p.val : 0;
            int j = (q != null) ? q.val : 0;
            int result = i + j + carry;
            carry = result / 10;
            curr.next = new ListNode(result % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if (carry == 1) {
            curr.next = new ListNode(carry);
        }
        return pHead.next;
    }
}

