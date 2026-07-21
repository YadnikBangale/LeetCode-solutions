class Solution {
    public int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int leftProd = 1;
        int rightProd = 1;

        for(int i = 0 ; i < nums.length ; i++) {
            ans[i] = 1;
        }

        while(left < nums.length) {

            ans[left] *= leftProd;
            leftProd = leftProd * nums[left];

            ans[right] *= rightProd;
            rightProd = rightProd * nums[right];

            left++;
            right--;
        }

        return ans;
    }
}