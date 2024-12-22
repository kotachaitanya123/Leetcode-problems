TC - O(N)
SC - O(1)

  Topics - Array, prefixSum, Sliding Window, Math

Problem : we need to find the minimu size of the subarray of an array whose sum is greater than or equal to the given target. we need to solve this problem in O(N) as
          we cannot sort the array it will disturb the relativeness of the array, so we approach this using sliding window and prefixSum.

Intuition : 
  we start with two pointers at start of the array one is moving pointer which at each iteration will be added to the sum.
  and every iteration we will check if sum >= target if this satisfies then we will update the minLength by comparing between the minLength and right - left + 1
  because the minLength is the answer we will return and if this condition is satisfied then we know that we have found a subarray between the left and the right pointer
  whose sum >= target and we will also do another thing that is we will remove the left pointer sum and we will move the left pointer by one step so that we we will check
  every possibility till the right reach the end of the array, and at each step we will increment the right pointer by one step.
  Finally return the minLength.
  
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, left = 0, right = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while(right < n) {
            sum += nums[right];
            while(sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
        
    }
}
