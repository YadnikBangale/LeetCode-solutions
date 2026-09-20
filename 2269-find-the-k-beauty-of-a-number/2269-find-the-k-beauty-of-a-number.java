class Solution {
    public int divisorSubstrings(int num, int k) {

        int n = (int) Math.log10(num) + 1;
        int arr[] = new int[n];
        int original = num;

        for(int i = n - 1 ; i >= 0 ; i--) {
            arr[i] = num % 10;
            num /= 10;
        }

        int left = 0;
        int number = 0;
        int count = 0;

        for(int right = 0 ; right < arr.length ; right++) {

            number = number * 10 + arr[right];

            if(right - left + 1 == k) {

                if(number != 0 && original % number == 0) {
                    count++;
                }

                number = number - arr[left] * (int)Math.pow(10, k-1);
                left++;
            } 
        }

        return count;
    }
}