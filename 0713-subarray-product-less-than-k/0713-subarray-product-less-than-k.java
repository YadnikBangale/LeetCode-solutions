class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int prod = 1;
        int counter = 0;
        for(int right = 0 ; right < nums.length ; right++) {
            prod *= nums[right];

            while(prod >= k) {
                prod /= nums[left];
                left++;
            }

           counter += right - left + 1;
        }

        return counter;
    }
}