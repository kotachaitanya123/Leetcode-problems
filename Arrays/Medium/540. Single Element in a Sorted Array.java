TC - O(N)
SC - O(1)

Problem : The below problem is about finding the single element in the array, where all elements will occur twice excpet for one element we can do it in two ways:
    1. Perform xor operation on the whole array all the duplicates will be removed and single element will in the value and return it.
    2. As we can see that given the array is in sorted order so we can simply perform binary search besides it's been given in the question that to do it in O(log N) and O(1).

Intuition :
    1. As given in the question each element will element will occur twice so performing xor will remove the duplicates and we are left with the single element.
    2. perform binary search :
          a. while start < end 
              calculate the mid
          b. if mid is not even then make it even to check the so we can check it with the adjacent element and if they are equal then we will increment the mid by 2 positions.
          c. else we will point end to the mid
          d. by the time we are done with the array nums[e] will be having the single element.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length, s = 0, e = n - 1;

        // O(log n) solution
        while(s < e) {
            int mid = (s + e) / 2;
            if(mid % 2 != 0) mid -= 1;
            if(nums[mid] == nums[mid + 1]) s = mid + 2;
            else e = mid;
        }

        return nums[e];

        O(N) solution
        s = 0;
        for(int i = 0; i < n; i++) {
            s ^= nums[i];
        }

        return s;
        
    }
}
