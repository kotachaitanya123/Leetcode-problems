TC - O(N)
SC - O(N)

Problem : In the below problem we are given with a linked list and an array we need to remove the elements that are present both in the linked list and array and 
          return the linked list with the elements that are not present in the array.

Intuition :
    We will use a HashSet as it will not allow duplicates, and add all the elements in the array to the set.
    now we will traverse the linked list from the first to last and whenever we come across the elements that is not in the set we will add that to the newHead
    as it takes only O(1) to check in the set the TC will remain O(N) only and move by one position.
    Return the ans which newHead is pointed.

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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode res = new ListNode();
        ListNode newHead = res, cur = head;
        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            s.add(i);
        }

        while(cur != null) {
            if(!s.contains(cur.val)) {
                newHead.next = new ListNode(cur.val);
                newHead = newHead.next;
            }
            cur = cur.next;
        }

        return res.next;
        
    }
}
