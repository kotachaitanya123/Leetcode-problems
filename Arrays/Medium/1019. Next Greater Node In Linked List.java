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
    public int[] nextLargerNodes(ListNode head) {
        ListNode cur = head;
        int length = 0;
        while(cur != null) {
            length++;
            cur = cur.next;
        }
        int nums[] = new int[length], p = 0, ans[] = new int[length];
        cur = head;
        while(cur != null) {
            nums[p] = cur.val;
            p++;
            cur = cur.next;
        }

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < length; i++) {
            while(!st.isEmpty() && nums[i] > nums[st.peek()]) {
                int index = st.pop();
                ans[index] = nums[i];
            }
            st.push(i);
        }

        return ans;
        
    }
}
