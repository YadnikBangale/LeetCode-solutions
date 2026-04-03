class Solution {
    public int hammingDistance(int x, int y) {
        
        int res = x ^ y;

        String ans = Integer.toBinaryString(res);
        int count = 0;

        char a[] = ans.toCharArray();

        for(int i = 0 ; i < a.length ; i++) {
            if(a[i] == '1') {
                count++;
            } 
        }

        return count;
    }
}