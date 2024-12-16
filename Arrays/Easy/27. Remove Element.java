TC - O(N)
SC - O(1)

Topics - Two Pointers, Array.
// The below problem is asks us to remove the val in array nums in-place and it is also stated that we should not use any extra space to solve the problem, so with
// all the information it is clear that we need to use two-pointers technique to solve the problem.
// We will have two pointers where they both start at same index but whenever nums[j] != val then we will increment then we will swap the nums[i] and nums[j] anad increment
// the j and i and when when nums[j] == val that means we have came acroos a value in nums array that has to be removed so we increment j to find where nums[j] != val
// and we perform the same operation in the first 'if' condition and finally when j == n we come out of the array and return the index of the i which is the length of 
// array after removing all the elements equal to val.

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, n = nums.length, j = 0;

        while(j != n) {
            if(nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        return i;
        
    }
}
