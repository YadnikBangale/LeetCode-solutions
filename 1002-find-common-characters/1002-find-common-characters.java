class Solution {
    public List<String> commonChars(String[] words) {

        List<String> common = new ArrayList<>();
        int[]freq = new int[26];

        for(int i = 0 ; i < words[0].length() ; i++) {

            freq[words[0].charAt(i)-'a']++;
            
        }

        for(int i = 1 ; i < words.length ; i++) {

            int curr[] = new int[26];
            for(int j = 0 ; j < words[i].length() ; j++) {

                curr[words[i].charAt(j) - 'a']++;

            }

            for(int l = 0 ; l < 26 ; l++) {
                freq[l] = Math.min(freq[l], curr[l]);
            }
        }
    
        for(int k = 0 ; k < 26 ; k++){
            while(freq[k] > 0){
                common.add(String.valueOf((char)(k + 'a')));
                freq[k]--;
            }

        }
        return common;
    }
}