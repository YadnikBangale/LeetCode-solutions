class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++) {

            set.add(nums[i]);
        
        }

        int longest = 0;

        for(int num : set) {
            if(!set.contains(num-1)) {

                int currentNum = num;
                int currentLength = 1;

                while(set.contains(currentNum+1)) {
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(currentLength, longest);
            }
        }

        return longest;
    }
}