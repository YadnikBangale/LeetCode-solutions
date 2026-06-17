class Solution {
    public int scoreOfString(String s) {
        
        char aplh[] = s.toCharArray();
        int ascii[] = new int[aplh.length];
        int score = 0;
        for(int i = 0 ; i < aplh.length ; i++) {

            ascii[i] = (int)aplh[i];            
        }

        for(int i = 0 ; i < ascii.length - 1 ; i++){

            score += Math.abs(ascii[i] - ascii[i+1]);
        } 


        return score;
    }
}