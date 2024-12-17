TC - O(N)
SC - O(1)
// The below code is merging two sorted lists and the answer should also be a sorted linked list as the two lists are in sorted order we are expected to solve the
// problem in O(N) and O(1) in interview point of view and we can solve this using two-pointers technique, where one pointer will be at the starting point of the list1
// and second pointer will be at the start of the list2 and we will use a while loop and keep track of the both pointers by moving and adding them to the empty
// list based on the value we come across in both the lists.

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // initialize an empty list
        ListNode ans = new ListNode();
        ListNode cur = ans;
        // iterate until one of the list of the two lists is empty and in each iteration add the value which is less than the other in whatsoever list to the 
        // ans, and move that particular list to the next step and cur to next pointer, by the time one of the list completes you will have all the values of that list
        // in the ans.
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            } else {
                 cur.next = list2;
                 list2 = list2.next;
                 cur = cur.next;
            }
        }

        // After completing one of the list we dont know which list gets completed by the end of the while so we will check that using ternary operator on the two 
        // lists and add the remaining list to the ans.
        cur.next = (list1 != null) ? list1 : list2;
        // return ans.next
        return ans.next;
         
    }
}
