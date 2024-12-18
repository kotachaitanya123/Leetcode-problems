TC - O(N)
SC - O(1)

Before we get into this question we need to discuss about hare and tortoise algorithm where we will have two pointers and one say (slow) takes one step at a time and the
other pointer say (fast) takes two steps at a time if there is a cycle then the last node does not point to null and it keeps on moving in the list and there is a possibility
that the slow and fast will meet any certain point and thats when we return true, if the above fails then the fast will point to null and we will break from the
while loop and execute and return false.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // start the slow and fast from head
        ListNode slow = head, fast = head;
        // make sure that the fast and fast.next does not point null as we take two steps at a time we will also check fast.next and until this condition is true
        // slow will move one step and fast will moves two steps, if at any point if slow and fast are equal return true.
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;

    }
}
