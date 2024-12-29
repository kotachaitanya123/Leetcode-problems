TC - O(N)
SC - O(1)

  Problem : In the below problem we are given with a linked list we need place all the nodes in the odd indices comes first and later the even indices nodes, we need
            to solve the problem in O(N) and O(1) space, and the indices start as the first node is considered to be the odd node.

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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return ;

        ListNode odd = head, even = head.next, evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;

    }
}
