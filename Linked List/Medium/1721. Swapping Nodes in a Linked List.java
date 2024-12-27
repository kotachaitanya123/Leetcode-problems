TC - O(N)
SC - O(N)

Problem : The above problem is sbout we are given a linked list and an integer k, we need to swap the nodes of linked list in the position kth from the start and end.

Intuition :
    Iterate through the linked list and find the length of the linked list.
    Now take two nodes - node1, node2 -> assign them to null, and cur to head of the linked list.
    iterate through the linked list using for loop as we know the length of the linked list and whenever we come across i == k then assign the node to node1 and whenever
    you come across i == length - k + 1 then assign the node to node2.
    After the completion of the for loop we have the nodes that need to be swapped are in node1 -> it is the kth from the start and node2 -> it is the kth node from
    the end all we need to do is swap them using temp variable and return the head.

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur = head;
        int length = 0;
        while(cur != null) {
            length++;
            cur = cur.next;
        }

        ListNode node1 = null, node2 = null;
        cur = head;
        for(int i = 1; i <= length; i++) {
            if(i == k) node1 = cur;
            if(i == length - k + 1) node2 = cur;
            cur = cur.next;
        }

        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;

        return head; 
        
    }
}
