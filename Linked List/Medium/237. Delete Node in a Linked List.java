TC - O(1)
SC - O(1)

we are given with the node of the linked list we need to remove the node from the head so we will use simple trick we will just over write the node 
  Overwrite data of next node on current node.
  Make current node point to next of next node.
As we should not return anything we just overwrite next to current and current to the next.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}
