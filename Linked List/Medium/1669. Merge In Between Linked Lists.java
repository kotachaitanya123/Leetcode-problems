TC - O(N)
SC - O(N)

problem : In the below problem we are given two linked lists and we are also given with two integers a, b where a is the index of the list1 that we need to add the 
          linked list2 till the position b of the list1.

Intuition :
        We wiil have a list of integers and we will add the list11 integers upto p and we will iterate the list2 and add the elements from the a + 1 to b and from b
        we will add the remaining elements of the list2, and we will have an linked list and add all the elements of the list to linked list.
        return the linked list.

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        List<Integer> l = new ArrayList<>();

        int p = 0;
        ListNode cur = list1;
        while(p < a) {
            l.add(cur.val);
            cur = cur.next;
            p++;
        }

        ListNode cur1 = list2;
        while(cur1 != null) {
            l.add(cur1.val);
            cur1 = cur1.next;
        }

        while(p < b + 1) {
            cur = cur.next;
            p++;
        }

        while(cur != null) {
            l.add(cur.val);
            cur = cur.next;
        }

        ListNode res = null;
        for(int i = l.size() - 1; i >= 0; i--) {
            ListNode newHead = new ListNode(l.get(i), res);
            res = newHead;
        }

        return res;
        
    }
}
