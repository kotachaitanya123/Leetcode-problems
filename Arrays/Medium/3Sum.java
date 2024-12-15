// TC - O(N ^ 2)
// SC - O(N)
// This problem requires you to find the pair of 3 integers in an array where their sum is 0 and also require
// that we should add the duplicate pair of three integers.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // declare the list of list of integers
        List<List<Integer>> l = new ArrayList<>();
        // sort the array however the program TC is O(N ^ 2) the sort will take O(Nlog N) only so we are going to use it
        Arrays.sort(nums);

        // Iterate upto n - 3 becaue we have j, k in n - 2, n - 1 positions respectively.
        for(int i = 0; i < n - 2; i++) {
            // if in any case the current element and the previous element are equal then continue to skip the duplicate elements.
            if(i > 0 && nums[i - 1] == nums[i]) continue;
            // start iterating j, k from i + 1, and n - 1 every iteration
            int j = i + 1;
            int k = n - 1;
            // find sum at each iteration.
            int sum = nums[i] + nums[j] + nums[k];
            // using the two pointers technique check for every possible values in between the j and k.
            while(j < k) {
                // if in any case sum is 0.
                if(sum == 0) {
                    // add the elements to the list as array of integers
                    l.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // until unless you find the element that is different from the next element of current j index
                    // k and j < k increment and decrement the j and k this is to avoid the duplicates in the array to again form as pair.
                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
                // if sum > 0 then decrement the k pointer so that we can get sum we require, and do the opposite if sum > 0
                else if(sum > 0) k--;
                else j++;
            }
        }
        // return the l
        return l;

    }
}
