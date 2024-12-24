TC - O(N)
SC - O(1)

Problem : In the below question we are given a linked list we need to return true if the it is a palindrome and false if not.

Intuition : 
      To check if the linked list is palindrome we will reverse the second half of the linked list and check if the first to the half of the linked list elements 
      are equal to the last to the half of the elements of the linked list.
      We will use Hare and Tortoise algorithm to to reach the middle of the linked list by the time the fast reach the end of the linked list the slow will be at the
      middle of the linked list and thats the point from where we need to reverse the linked list.
          REVERSE THE LINKED LIST FROM THE MIDDLE TO END WE WILL WRITE A METHOD REVERSELIST WITH PARAMETER SLOW WHICH POINTS TO THE MID OF THE LIST:
              Use a prev pointer and point it to null
                prev = null, cur = slow;
              while cur != null => cur_ points to cur.next and at each iteration swap the prev to cur and cur to cur_ by the time we reach the end the list will be
                                   pointing in reverse order from the last to the middle and this method will return a listnode
          CHECKING THE PALINDROME :
                while the reversed and head is not null in each iteration check if the head.val != reversed.val if any point if this condition fails at any point then
                return false if the linked list reaches the null without satisying the failing condition we will return true, which will resembles that the linked list is
                palindrome.  
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversed = reverseList(slow);

        while(head != null && reversed != null) {
            if(head.val != reversed.val) return false;
            head = head.next;
            reversed = reversed.next;
        }

        return true;

    }

    private ListNode reverseList(ListNode slow) {
        ListNode prev = null, cur = slow;
        
        while(cur != null) {
            ListNode cur_ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = cur_;
        }

        return prev;

    }

}
