TC - O(N)
SC - O(1)

Problem Description :
The above problem is about swapping the adjacent nodes of linked list we need to modify the list we should use one constant space and the algorithm should run in O(N)

Intuition :
  Assign the prev pointer to head, check if head is null then return the null, if head.next is null then return head as we require two nodes to swap.
  while prev and prev.next is not null assign a pointer next to the cur :
        Swap the cur and prev using a temp variable 
        Assign prev to next of cur as we need to skip the adjacent node of the prev
  return the head.

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
    public ListNode swapPairs(ListNode head) {
        ListNode prev = head;
        if(head == null) return null;
        if(head.next == null) return head;
        while(prev != null && prev.next != null) {
            ListNode cur = prev.next;
            int temp = prev.val;
            prev.val = cur.val;
            cur.val = temp;

            prev = cur.next;
        }

        return head;

    }
}
