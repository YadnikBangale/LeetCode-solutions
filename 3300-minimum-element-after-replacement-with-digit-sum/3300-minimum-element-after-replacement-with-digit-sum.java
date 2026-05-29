class Solution {
    public int minElement(int[] nums) {
        
        int sum = 0;
        int min_sum = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {   
            int num = nums[i];
            while(num != 0) {
                sum = sum + num%10;
                num = num/10;
            }

            if(sum < min_sum) {
                min_sum = sum;
            }

            sum = 0;
        }

        return min_sum;
    }
}