class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total_size = nums1.length + nums2.length ;
        int arr[] = new int[total_size];

        for(int i = 0 ; i < nums1.length ; i++) {
            arr[i] = nums1[i];
        }

        for(int i = 0 ; i < nums2.length ; i++) {
            arr[nums1.length + i] = nums2[i];
        }

        Arrays.sort(arr);

        if(total_size % 2 == 0) {
            return ((double)arr[total_size / 2] + arr[(total_size / 2)-1])/2 ;
        }
        else {
            return (double)arr[total_size / 2];
        }
    }
}