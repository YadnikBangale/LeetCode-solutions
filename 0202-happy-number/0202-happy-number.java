class Solution {
    public boolean isHappy(int n) {

        if (n == 0) {
            return false;
        }

        int sqSum = 0;
        int num;

        while (n != 1 && n != 4) {

            sqSum = 0;
            num = n;

            while (num > 0) {
                int digit = num % 10;
                sqSum += digit * digit;
                num /= 10;
            }

            n = sqSum;
        }

        return n == 1;
    }
}