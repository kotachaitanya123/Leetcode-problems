TC - O(N)
SC - O(1)

The reversing of the linked list is the reversing the numbers in the list its about the pointing of the whole list in a reverse order.
We need two pointers one is prev and the other is cur which start from the starting point of the head, we will move towards the end of the list while moving until
the cur != null we will have another pointer(cur_) that points to the cur.next in every iteration that is next node of the list and here starts our logic like we 
will point cur.next to prev where will remove the link between cur.next and point it towards the prev and make the prev node as cur node and we will assign our cur
cur_ which at the cur.next in every iteration, by the time the cur == null the loop will break and we will return the prev.

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
    public ListNode reverseList(ListNode head) {        
        ListNode prev = null, cur = head;
        
        while(cur != null) {
            ListNode cur_ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = cur_;
        }

        return prev;

    }
}
