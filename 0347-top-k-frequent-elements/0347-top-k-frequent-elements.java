class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 0) {
            return new int[0];
        }
        int max = nums[0];
        int min = nums[0];

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        int shift = -min;
        int arr[] = new int[max - min + 1];

        for(int i = 0 ; i < nums.length ; i++) {
            arr[nums[i] + shift]++;
        }

        int result[] = new int[k];
        int index = 0;
        
        while(index < k) {

            int maxfreq = -1;
            int num = -1;

            for(int i = 0 ; i < arr.length ; i++) {

                if(arr[i] > maxfreq) {
                    maxfreq = arr[i];
                    num = i;
                }
            }

            if(num == -1) {
                break;
            }

            result[index] = num - shift;
            index++;

            arr[num] = -1;
        }

        return result;

    }
}