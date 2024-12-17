TC - O(N)
SC - O(1)

// The below code is used to remove the duplicates from the sorted list, as it is sorted we will assign the cur to head, while we are moving from left to the right
// and at each point we will see whether the next value of the cur value is equal to it whenever we find like that we will simply move out cur pointer to the cur.next.next
// and return head at the last.

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if(cur.val == cur.next.val) cur.next = cur.next.next;
            else cur = cur.next;
        }

        return head;
        
    }
}
