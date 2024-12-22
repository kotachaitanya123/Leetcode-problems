TC - O(N)
SC - O(1)

Problem : This is the same old two sum question but it has some modifications that is the input array is sorted so we are not allowed to use extra space and we are 
          required to solve this problem in O(N) and O(1) space complexities.

Intuition : This all bring down to using of two pointers which can help to achieve the O(N), and we know that the numbers definitely is going to between p and q because
we know that the input array is sorted so we keep on adding the nums[p] and nus[q] based on the value of the sum whether it is ==, <, or > than target we are going to move
the pointers at each and every step.
  1. declare two pointers p and q at start and end of the array.
  2. iterate until the both pointers do not meet and at each and every iteration calculate the sum of the nums[p] and nums[q].
  3. check :
      a. if sum == target then return the new int[] {p + 1, q + 1}
      b. else if sum < target then it is clear that nums[p] is small so move the p pointer towards q.
      c. else move the q pointer towards p.
This will work efficiently cause we know that the numbers are going to in between the search space of p and q as we move them one step at a time we make sure we check every possible way.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length, p = 0, q = n - 1;
        while(p < q) {
            int sum = numbers[p] + numbers[q];
            if(sum == target) return new int[]{p + 1, q + 1};
            else if(sum > target) q--;
            else p++;
        }

        return new int[]{-1, -1};
        
    }
}
