TC - O(N)
SC - O(1)

Problem : In the below problem we are given with a linked list we need to return the linked list elements from the middle to the last of the list. We will use the
          Hare and Tortoise Algorithm to achieve this.

Intuition :
      We will use two pointers slow and fast which is called Hare and Tortoise Algorithm to find the middle element as we do not know the indices of the elements in the linked list.
      while fast and fast.next != null we will move slow by one step and fast by two steps by the time the fast reaches the end of the list slow will be at the middle
      of the linked list and return the slow, which will return the linked list from the middle to the end.

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
    public ListNode middleNode(ListNode head) {
        ListNode cur = head, slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        
    }
}
