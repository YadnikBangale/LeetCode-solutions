class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int arr[] = new int[code.length];

        if(k == 0) {
            return arr;
        }

        int left, right;

        if(k > 0) {

            left = 1;
            right = k;
        }

        else {

            left = code.length + k;
            right = code.length - 1;
        }

        int sum = 0;

        for(int i = left ; i <= right ; i++) {

            sum += code[i];
        }

        for(int i = 0 ; i < code.length ; i++) {

            arr[i] = sum;

            sum -= code[left % code.length];
            left++;

            right++;
            sum += code[right % code.length];
        }

        return arr;
    }
}