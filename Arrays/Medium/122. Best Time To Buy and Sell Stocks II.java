TC - O(N)
SC - O(1)

Topics - Array, Dynamic Programming, Greedy.

Problem : You need to buy and sell stocks so you need to buy a stock at low price and sell it at when you get a high price and get profit each day.
Intuition :
  initialize the min value to the start of the array, sum to 0.
  iterate in the prices from 1 because the min is already assigned to the prices[0].
  in each and every iteration find the min value between current min and prices[i].
  check if the prices[i] > min then add the profit to the sum i.e., the difference between the prices[i] and min.
  And reassign the min with prices[i] as it is less than the prices[i].
  return the sum.

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, min = prices[0], sum = 0;

        for(int i = 1; i < n; i++) {
            min = Math.min(prices[i], min);
            if(prices[i] > min) {
                sum += Math.abs(prices[i] - min);
            }
            min = prices[i];
        }

        return sum;

    }
}
