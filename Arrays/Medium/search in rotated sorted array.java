TC - O(log N)
SC - O(1)
// The below problem is to find the target in a sorted array it is clear use of the binary search application though we solve the probelm in O(N) in the interview 
// you will be asked to solve the problem in O(log N) as clearly the array is sorted we should use binary search only.

// This problem requires two sub-problems that is applying the binary search and finding the target in one of the subarray i.e., the array will be divided into two
// subarrays such

class Solution {
    public int search(int[] nums, int target) {
        // initialize the start and end of the array to implement the binary search
        int n = nums.length, s = 0, e = n - 1;
        // apply binary search by general condition of writing the search space of the array.
        while(s <= e) {
            // calculate the mid of the array in every iteration.
            int mid = (s + e) / 2;
            // 
            if(nums[mid] >= nums[0] && nums[0] > target) s = mid + 1;
            else if(nums[mid] < nums[0] && nums[0] <= target) e = mid - 1;
            // if the above condition fails the check the below condition and update the s and e and in any case if target is found then return the mid.
            else {
                if(nums[mid] == target) return mid;
                else if(nums[mid] <= target) s = mid + 1;
                else e = mid - 1;
            }
        }
        
        return -1;
        
    }
}
