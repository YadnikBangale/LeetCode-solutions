class Solution {
    public int maxNumberOfBalloons(String text) {
        
        char letters[] = text.toCharArray();
        int instance = 0;
        int freq[] = new int[26];

        for(int i = 0 ; i < letters.length ; i++) {
            freq[letters[i] - 'a']++;
        }
        
        int ans = freq['b'-'a'];
        ans = Math.min(ans, freq['a'-'a']);
        ans = Math.min(ans, freq['l'-'a']/2);
        ans = Math.min(ans, freq['o'-'a']/2);
        ans = Math.min(ans, freq['n'-'a']);

        return ans;
    }
}