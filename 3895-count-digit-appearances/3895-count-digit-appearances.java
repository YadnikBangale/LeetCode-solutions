class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

        int digitCount = 0;
        for(int i = 0; i < nums.length ; i++) {
            int num = nums[i];
            while(num != 0) {
                int lastDigit = num % 10;
                if(lastDigit == digit) {
                    digitCount++;
                } 
               num = num / 10;             
            }
        }

        return digitCount;
    }
}