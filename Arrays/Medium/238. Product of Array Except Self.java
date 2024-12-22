TC - O(N)
SC - O(N)

Topics - Array, PrefixSum

Problem : We need to the return an array that has the product of elements other than itself, we need to impement the solution in O(N) and we should not use the division
          operator i.e., we simply could not find the product of the array and simply divide the product with that particular element and place it in the answer array.

Intuition :
    We will have two arrays one is for the product of the elements from the left to the right of the array and another is for the product of elements from the right to
    the left of the array and we will just multiply the relative i.e., same index of the two array's elements and update the answer for that particukar index.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, leftPro = 1, rightPro = 1, p = n - 1, k = 1;
        int a[] = new int[n], b[] = new int[n], c[] = new int[n];
        a[0] = 1;
        b[n - 1] = 1;

        for(int i = 0; i < n - 1; i++) {
            leftPro *= nums[i];
            a[k] = leftPro;
            k++;
        }

        k = n - 2;
        while(p >= 1) {
            rightPro *= nums[p];
            b[k] = rightPro;
            p--;
            k--;
        }        


        for(int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
        
    }
}
