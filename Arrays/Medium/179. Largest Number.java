TC - O(Nlog N)
SC - O(1)

  Topics - Array, Greedy, String, sorting

Problem : We are given with an non-negative integer array we need to find the largest possible number by concatinating the integers in the array as we may get a very large
          number we are required to return a string. This question has no contraints like should be solved in O(N) and constant space so we are going to use the sort
          method as well as the hashmap to keep track the numbers we get after adding(concatinating) them.

Intuition : 
  Store each number in array into string array as we need to return answer in string format.
  Now use Arrays.sort() to find the largest possible but we will not compare the numbers directly we will take two numbers at a time and concatinate the numbers and 
  like a + b and b + a we will sort based on this by the time we complete the whole array all the numbers are in an order such that if you a stringbuilder and append
  each string you will get the largets number possible from the array of integers.
  now append them to stringbuilder and return ans.toString().

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String ans[] = new String[n];
        for(int i = 0; i < n; i++) {
            ans[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(ans, (a,b) -> (b + a).compareTo(a + b));
        if(ans[0].equals("0")) return "0";

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < n; i++) res.append(ans[i]);

        return res.toString();
        
    }
}
