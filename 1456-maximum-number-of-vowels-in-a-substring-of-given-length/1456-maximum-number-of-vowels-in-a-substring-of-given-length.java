class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int max = 0;

        for(int right = 0 ; right < s.length() ; right++) {

            char ch = s.charAt(right);

            if(isVowel(ch)) {
                count++;
            }

            while(right - left + 1 > k) {
                
                if(isVowel(s.charAt(left))) {
                    count--;
                }


                left++;
            }

            if(right - left + 1 == k) {
                max = Math.max(max, count);
            }
        }

        return max;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}