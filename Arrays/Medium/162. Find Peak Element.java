TC - O(log N)
SC - O(1)

  Topics - Arrays, Binary Search

problem - In the below question we are given with an array we need to return the index of the peak element - the element whose neighbours are greater than it's neighbours.
          we can do it in O(N) using two pointers but we need to solve the question in O(log N) in the interview point of view as the array is sorted, So its clear that
          we need to use the binary search to attain O(log N)

intuition :
      As we know we need to implement the binary search we will make small modification in returning of the index i.e., we will find at every iteration and we will
      check if the next element(mid + 1) is less than the mid then we need to move the s to mid + 1 or else we need to move the e to the end, so that when we return the
      e that will have the index we looking for.

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length, s = 0, e = n - 1;

        while(s < e) {
            int mid = s + (e - s) / 2;
            if(nums[mid] < nums[mid + 1]) {
                s = mid + 1;
            } 
            else e = mid;
        }

        return e;
        
    }
}
