TC - O(N)
SC - O(1)

  Topics - Array, two pointers, Math

Problem : we are given an array and an integer k we need to rotate the last k elements of the array and move them to the front of the array.

Intuition : 
  We are going to solve this problem using a recursive approach, that is we swap the integers in 3 steps :
    1. Rotate the whole array by swapping the numbers of front to last ans last ones to the front.
    2. In this step rotate/swap the first k elements.
    3. Then swap the numbers from k to last of the array.
  As the method is void type we do not return anything.

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length, i = 0, j = n - 1;
        k = k % n;
        rotate(nums, 0, n - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, n - 1);
    }

    public void rotate(int[] nums, int p, int q) {
        while(p < q) {
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
            p++;
            q--;
        }
    }

}
