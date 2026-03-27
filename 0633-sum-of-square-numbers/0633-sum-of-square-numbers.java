class Solution {
    public boolean judgeSquareSum(int c) {

        int n = (int)Math.sqrt(c);
        int nos[] = new int[n + 1];

        for(int i = 0 ; i <= n  ; i++) {
            nos[i] = i;
        }

        int low = 0 ;
        int high = nos.length-1;
        
        while(low <= high) {

            long sum = (long)(nos[low] * nos[low]) + (long)(nos[high] * nos[high]);
            if(sum == c) {
                return true;
            }

            else if(sum > c) {
                high--;
            }

            else {
                low++;
            }
        }

    return false;
        
    }
}