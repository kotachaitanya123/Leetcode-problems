TC - O(N)
SC - O(N)

Topics - Array, Design, Math, Randomized

Problem : We are given with an nums array of integers and the class has been initialized and created an object so we need to just implement the class.
          we have three methods, Solution this is just to initialize the array of integers.
          and we have reset method that which will return the original array that is exact form of the array.
          and another method is shuffle which will return a shuffled array each and every time this method is called.

The solution and intuition is explained in each and every step of the program.

class Solution {
    // to keep track of the original array, to return it whenever reset() is called
    private int[] original;
    // this is the nums array that we use
    private int[] nums;
    // to generate the rand element
    private Random rand = new Random();

    public Solution(int[] nums) {
        // to initialize the array
        this.nums = nums;
        // to keep keep track of the original nums so that when the reset() called we can return it
        this.original = nums.clone();
    }
    
    public int[] reset() {
        // initialixe the nums with the original.clone() to put the original order of nums in it to return.
        nums = original.clone();
        return nums;
    }
    
    public int[] shuffle() {
        // declare the shuffeld array which we use to shuffle and rearrange based on the rand variable
        // and firstly put all the nums elements to the shuffled array.
        int shuffled[] = nums.clone();
        int n = shuffled.length;
        for(int i = n - 1; i > 0; i--) {
            // to get the rand element from the array and later perform the shuffle by simply swapping
            // the elements of the array with i and j where j being the random and i being the order
            // of traversal of the array.
            int j = rand.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
