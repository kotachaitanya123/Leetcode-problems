TC - O(N)
SC(1)

// in the below problem we are given with a value(val) and a linked list we are required to remove the elements that are equal to the val from the linked list
// we need to check if the head is null then return null and there is another edge case that we have deal with that is if all the elements of the linked list are equal
// and equal to the val then we need to return the empty list thats what the first while does.
// in the second while loop we will check if the cur and cur.next != null as if the cur.next == val we will skip that by cur.next = cur.next.next, else we will move the
// cur by one position and at the end we will return the head of the linked list.

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
    public ListNode removeElements(ListNode head, int val) {
        // if head is null return null.
        if(head == null) return null;
        // we will check if the head.val == val then we will move the pointer by one position just if the whole list has same elements the val.
        while(head != null && head.val == val) head = head.next;
        // point cur to the head.
        ListNode cur = head;
        
        // we will break the while loop when cur and cur.next is null as there will case that we might be at the end of the list and the cur.next maybe val and cur
        // cur maybe equal to the val we want to remove, as we need to move the pointer by two steps this may give the error in this case. the llogic is we will move towards
        // the end of the list id we found any cur.next.val == val then we will move the pointer by two steps, else by one step at the end we will return the head.
        while(cur != null && cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }
        return head;
    }
}
