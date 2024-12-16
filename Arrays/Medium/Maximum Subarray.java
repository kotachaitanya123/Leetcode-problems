TC - O(N)
SC - O(1)
// The below code is about finding the sum of the subarray with the largest sum and returning the sum. This is use of the classic Kadane's Algorithm. This is used to
// find the largest subarray with maxSum in O(N) rather than in O(N ^ 2).

class Solution {
    public int maxSubArray(int[] nums) {
        // initialize the length of the array, maxSum to the MIN_VALUE of the integer, and sum to 0 to add the values of the array in each iteration.
        int n = nums.length, maxSum = Integer.MIN_VALUE, sum = 0;

        for(int i = 0; i < n; i++) {
            // add the nums[i] to sum in each and every iteration.
            sum += nums[i];
            // If in any iteration if sum is less than zero then assign the sum to zero.
            if(sum < 0) {
                sum = 0;
            }
            // if the above condition fails then check and update the maxSum with sum after adding the current value of the nums.
            maxSum = Math.max(sum, maxSum);
        }
        // return the maxSum.
        return maxSum;

    }
}
