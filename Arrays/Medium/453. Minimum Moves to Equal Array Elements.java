TC - O(N)
SC - O(1)

Topics - Array, Math

Problem : We are given an array of integers we need to find the minimum number of moves required to make the array elements equal.

Intuition : 
  We will sort the array.
  We will declare the starting element of the array as first, because we need to make all the elements equal to it so we keep ot static for the whole solution.
  And while we start to iterate the array we will add the difference between the first(nums[0]) element and current element to the answer, because that is the element 
  that is filled with on the array after completion of the solution to make the array equal because to make array equal there are 2 ways either we sort and make the whole
  array elements equal to the first of the array or sort the array and make the whole array equal to the last of the array.

class Solution {
    public int minMoves(int[] nums) {
        // sort the array
        Arrays.sort(nums);
        // initialize the first to nums[0]
        int n = nums.length, ans = 0, first = nums[0];
        // iterate through the array while iterating find the difference between the first element of the array and the current element of the loop and add it to the
        // ans because that is the number moves you need to make the whole array elements equal.
        for(int i = 0; i < n; i++) {
            ans += nums[i] - first;
        }
        // return the ans
        return ans;
        
    }
}
