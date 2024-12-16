TC - O(N)
SC - O(N)

    Topics - Array, HashMap, sorting

// This is the first basic question in problem solving even I was asked in a Technical Interview round it can be solved in 3 ways but you will be asked to solve it in O(N).
    // 1. Using inner for loop - O(N ^ 2) & O(1)
    // 2. Sort the array and use the two pointers - O(N log N) & O(1)
    // 3. Using the hashmap to keep track of the values and indices - O(N) & O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Find the length of the array
        int n = nums.length;
        // Declare a map to store the integers and their indices
        Map<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < n; i++) {
            // find the complement
            int complement = target - nums[i];
            // check whether the complement exists in the map, if exists then return the indices of complement and the current element.
            if(h.containsKey(complement)) {
                return new int[]{i, h.get(complement)};
            }
            // if the 'if' condition fails then the below line will put the integer and index of the value.
            h.put(nums[i], i);
        }

        // return array of negative indices if you could not find any indices.
        return new int[]{-1, -1};
        
    }
}
