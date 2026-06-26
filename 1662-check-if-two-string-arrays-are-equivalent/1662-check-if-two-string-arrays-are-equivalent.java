class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String Sword1 = String.join("", word1);
        String Sword2 = String.join("", word2);
        boolean same = false;
        if(Sword1.equals(Sword2)) {
            same = true;;
        }

        return same;
        
    }
}