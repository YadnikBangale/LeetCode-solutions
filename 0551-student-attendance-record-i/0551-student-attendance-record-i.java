class Solution {
    public boolean checkRecord(String s) {
        char att[] = s.toCharArray();
        int absentCount = 0; 
        int lateCount = 0;
        for(int i = 0 ; i < att.length ; i++) {
            if(att[i] == 'A') {
                absentCount++;
            }
        }

        for(int i = 0 ; i < att.length-2 ; i++) {
            if(att[i] == 'L' && att[i+1] == 'L' && att[i+2] == 'L') {
                lateCount++;
            }
        }

        if(absentCount >= 2 || lateCount >= 1) {
            return false;
        }

        return true;
    }
}