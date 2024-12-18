TC - O(N)
SC - O(1)

Problem Description : 
In the below problem we are given with a linked list and an integer value n(index) that has to be removed from the end of the list. As we cannot traverse from back
of the linked list to remove the nth node we will have to move towards the end, so we will use the hare and tortoise algorithm i.e., fast and slow pointers, where
the slow pointer take one step at a time and the fast will take two steps at a time.

Intuition :
To solve this problem we will first iterate in the for loop until nth position in forward direction and move the fast by one position in every iteration, and exit
from the loop, we will check if fast is null by the end of the loop if it is pointing to null then we will return null, if not then continue the looping of fast
but this time along with fast we will also start the slow from the starting point of the linked list and we will move the slow and fast by one position each and every
iteration by the time we reached the end of the loop our slow will be one pointer ahead of the nth node from the end of the list so we will just move the slow by
two points and point it to the slow.next.next so we can skip the nth in the head, and finally return the head of the linked list.

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        if(head == null) return head;

        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if(fast == null) return null;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;

    }
}
