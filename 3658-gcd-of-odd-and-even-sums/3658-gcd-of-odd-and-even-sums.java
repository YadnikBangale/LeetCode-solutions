class Solution {
    public int gcdOfOddEvenSums(int n) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            sumOdd += (2 * i - 1);
            sumEven += (2 * i);
        }

        while(sumOdd != 0) {
            int temp = sumOdd;
            sumOdd = sumEven % sumOdd;
            sumEven = temp;
        }

        return sumEven;
    }
}