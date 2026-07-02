class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0;
        int count = 0;
        int max = 0;
        int freq[] = new int[26];

        for(int right = 0 ; right < s.length() ; right++) {

            char ch = s.charAt(right);
            freq[ch - 'a']++;

            while(right - left + 1 > 3) {
                freq[s.charAt(left) - 'a']--;
                left++;                
            }

            if(right - left + 1 == 3) {

                if(freq[s.charAt(left)-'a'] == 1 && 
                   freq[s.charAt(left + 1)-'a'] == 1 &&
                   freq[s.charAt(left + 2)-'a'] == 1) {

                    count++;
                }

                max = Math.max(count, max);
            }
        }

        return max;
    }
}