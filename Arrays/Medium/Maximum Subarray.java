class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length, maxSum = Integer.MIN_VALUE, sum = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];

            if(sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;

    }
}
