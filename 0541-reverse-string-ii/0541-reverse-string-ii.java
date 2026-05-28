class Solution {
    public String reverseStr(String s, int k) {
        

        char array[] = s.toCharArray();
        for(int i = 0 ; i < array.length ; i+= 2*k) {

            int low = i;
            int high = Math.min(i+k-1, array.length-1);

            while(low < high) {

                char temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                low++;
                high--;
            }

        }

        return new String(array);
    }
}