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
            // if the 'if' condition then the below line will put the integer and index of the value.
            h.put(nums[i], i);
        }

        // return array of negative indices if you could not find any indices.
        return new int[]{-1, -1};
        
    }
}
