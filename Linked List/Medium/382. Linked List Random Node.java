TC - O(N)
SC - O(N)

Solution(ListNode head) Initializes the object with the head of the singly-linked list head it is initialized by calling the constructor.
We will declare the arraylist and we will traverse towards the end of the list and add it to the list.
In getRandom method we will get a random integer in the range of size of the list and we will return the element of the list of that random index.

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
    List<Integer> l = new ArrayList<>();
    public Solution(ListNode head) {
        while(head != null) {
            l.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        double ans = Math.random()*l.size();
        return l.get((int) ans);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
