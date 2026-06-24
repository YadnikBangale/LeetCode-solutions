class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> maxCandies = new ArrayList<>();
        boolean check;

        for(int i = 0 ; i < candies.length ; i++) {

            check = true;
                
            for(int j = 0 ; j < candies.length ; j++) {

                if(candies[i] + extraCandies < candies[j]) {
                    check = false;
                    break;
                }
                
            }

            maxCandies.add(check);           
        }

        return maxCandies;
    }
}