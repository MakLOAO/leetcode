package AddTwoNumbers;

public class AddTwoNumbersTest {

/**
 * @program: leetcode1
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-03-25 22:33
 **/
    public static void main(String[] args) {
        ListNode l1Head = new ListNode(9), l2Head = new ListNode(1);
        ListNode l1 = l1Head; ListNode l2 = l2Head;
        l1.next = new ListNode(9);
        l1 = l1.next;
        ListNode result = Solution.addTwoNumbers(l1Head, l2Head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
