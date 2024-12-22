TC - O(N)
SC - O(N)

  Topics : Array, PriorityQueue, Divide and Conquer, Sorting

Problem : In the problem we are given with an array and an integer k we need to return the kth largest integer from the array. we can simply sort the array and return
          the nums[nums.length - k] element but it will O(Nlog N) which is not an efficient one so you will be asked to write a solution in O(N) and can use O(N) space
          So, we will use a minHeap to keep track the kth largest element.
Intuition : 
  we will just put the first k elements we come across in the array so that we can make sure that we are using the queue of size k and the peek is the kth largest element.
  now we will again iterate in the array from k to the nums.length and we will check in each and every iteration that the element is greater than the peek() of the queue
  if so we will just remove the number from the queue and push that elenent to the queue, by the time we completed the array the peek of the queue will be having the
  element that has to be returned.

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = nums.length;
        for(int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for(int i = k; i < n; i++) {
            if(nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();

    }
}
