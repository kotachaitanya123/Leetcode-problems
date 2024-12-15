class Solution {
    public int maxArea(int[] height) {
        int n = height.length, p = 0, q = n - 1, maxArea = 0;
        // for every iteration check if the left index is less the right index
        while(p < q) {
            // find the area difference between the left and right index using the formula
            // the difference between the indices and the min height of the both values.
            int area = Math.min(height[p], height[q]) * (q - p);
            // update the maxArea by comparing it with current area.
            maxArea = Math.max(maxArea, area);
            // if the height[p] < height[q] then increment the p or else decrement the q.
            if(height[p] < height[q]) p++;
            else q--;
        }

        // return the maxArea after checking the whole container.
        return maxArea;
        
    }
}
