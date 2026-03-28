class Solution {
    public int maxAscendingSum(int[] nums) {
        int Currentsum = nums[0];
        int finalsum = nums[0];
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] > nums[i-1]) {
                Currentsum += nums[i];
            }
            else {          //if increasing keep adding else start new subarray
                Currentsum = nums[i];
            }

            finalsum = Math.max(Currentsum, finalsum);
        }

        return finalsum;
    }
}