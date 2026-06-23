class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int small[] = new int[nums.length];
        int numCounter = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = 0 ; j < nums.length ; j++) {
                if(nums[j] < nums[i]) {
                    numCounter++;
                }
            }
            small[i] = numCounter;
            numCounter = 0;
        }

        return small;
    }
}