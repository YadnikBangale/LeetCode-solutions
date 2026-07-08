class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int left = 0;
        int whiteCount = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0 ; right < blocks.length() ; right++) {

            char ch = blocks.charAt(right);
            if(ch == 'W') {
                whiteCount++;
            }

            while(right - left + 1 > k) {

                if(blocks.charAt(left)=='W') {
                    whiteCount--;
                }
                left++;
            }
            
            if(right - left + 1 == k) {
                
                ans = Math.min(whiteCount, ans);
            }

        }

        return ans;
    }
}