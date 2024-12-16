TC - O(N ^ 2)
SC - O(1)
// In the below problem we are going to discuss about 3sum closest something similar to 3Sum but we are given with integer value target in this problem we need to find the sum
// of three numbers that is closest to the target in the array.

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        // Hence the main logic of the code will take up O(N ^ 2) the sort won't be problem as it takes only O(Nlog N).
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            // The below step is to avoid duplicates.
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            // intialize the variables j, k that is next to i and another one at n - 1 posistion to check the whole array using two pointers technique between
            // j and k for each value of the i.
            int j = i + 1;
            int k = n - 1;
            // Apply Two pointers between j and k that is keeping i constant check if any value of both nums[j] and nums[k] will make a pair with nums[i].
            while(j < k) {
                // calculate the sum i.e., nums[i] + nums[j] + nums[k]
                int sum = nums[i] + nums[j] + nums[k];
                // check the calculated sum - target is less than the ans and update the ans with sum i.e., the closest sum we got to the target and that is the answer.
                if(Math.abs(sum - target) < Math.abs(target - ans)) ans = sum;
                // If the sum is than target then increment the j so that as we sorted the array the right values will be greater and make the sum more close to the target.
                else if(sum < target) j++;
                // It is the opposite step to the else if case as if the sum > target we need to move the k to left sa it will decrease the value of nums[k] and makes sum closest to the target.
                else k--;

            }

        }
        // return the ans that is ths closest we can get to the target.
        return ans;
        
    }
}
