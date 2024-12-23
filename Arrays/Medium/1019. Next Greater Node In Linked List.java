TC - O(N)
SC - O(N)

Problem - The below problem we are given a linked list in the linked list we need to find the next greater element of the current element from its index to the last 
          of the list and we need to return array of integers which contains the next greater element for that element. We can do this in O(N ^ 2) but the interviewer
          will ask for a solution in O(N) TC and we can use O(N) space so we use stack to efficiently to keep track of the index of the next greater element.

Intuition :
    We will iterate through the linked list and find the length of the list.
    we declare an array of whose length is length of the linked list.
    we will again iterate through the linked list and add each value of the linked list to the array.
    From now on we will use a stack to find the next greater element which takes up O(N) space but with stack we can solve the problem in O(N) Time Complexity.
    We will iterate through the array and in every iteration if the stack is not empty and the nums[i] is greater than the peek of stack then we will pop the peek
    the index of the peek() and add that element to the answer array at that index.
    if the above condition fails then we will push the index of the element to the stcak.
    Finally we will return the answer array.

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
