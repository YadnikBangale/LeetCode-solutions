class Solution {
    public int secondHighest(String s) {
       char a[] = s.toCharArray();
        int first = -1;
        int second = -1;

       for(int i = 0 ; i < a.length ; i++) {
            if(Character.isDigit(a[i])){
                
                if(a[i]-'0' > first) {
                    second = first;
                    first = a[i]-'0';
                }

                else if(a[i] - '0' > second && a[i] - '0' != first) {
                    second = a[i] - '0';
                }

            }
       } 

       return second;
    }
}