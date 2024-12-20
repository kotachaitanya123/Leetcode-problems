TC - O(N)
SC - O(1)

The below code is for sort the numbers in the array which contains only 0, 1, and 2 we can solve it just by using sort() but as it takes O(Nlog N) we should not use it.

Intuition :
The logic is very simple as the array has only 0, 1, 2 if we can get all the 0's to the start of the array and all 2's to the end of the array all the 1's in the array
will come obviously come to the middle of the array so we need to use this simple hack while implementing this solution.
And in the interview we are expected to do the solution in O(N) so lets see how to solve it in O(N) use 3 pointers ;
  1. Initialize the pointers i, j, k at 0, 0, n - 1.
  2. The pointer i is fixed pointer we do not move that pointer keep it static unless we get 0 at j pointer, and we also keep k pointer static unless we get 2 at j pointer.
  3. If the j pointer is pointing to 0 we will immediately swap it with i and increment the i and j pointer, but when we swap it with k pointer we will not increment the j
     pointer because there might be a possibility that we might get again j as 2 so we only decrement k and whenever we get 1 we will just simply increment the j without any operations.

As the return type is void d not return anything just modify the array.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length, i = 0, j = 0, k = n - 1;

        while(j <= k) {
            // whenever you encounter nums[j] with 0 then swap it with nums[i] and increment i and j so all the zeros will be moved to front of the array.
            if(nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
              
            // if you encounter nums[j] with 1 then simply increment the pointer j as 1's should be at the middle of the array.
            else if(nums[j] == 1) j++;
            // if you encounter with 2 then swap the j and k and decrement the k but do not modify the j because there might be a possibility that the swapped value maybe
            // 0 or 2 if that is the case then we again need to swap it based on the value of nums[j].
            else {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }
        } 
    }
}
