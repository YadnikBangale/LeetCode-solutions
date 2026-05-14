class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> anslist = new ArrayList<String>();

        for(int i = 1 ; i <= n ; i++) {
            if(i%3 == 0 && i%5 == 0) {
                anslist.add("FizzBuzz");
            }
            else if(i%3 == 0) {
                anslist.add("Fizz");
            }
            else if(i%5 == 0) {
                anslist.add("Buzz");
            }
            else {
                anslist.add(String.valueOf(i));
            }
        }

        return anslist;

    }
}