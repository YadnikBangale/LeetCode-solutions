class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = costs[0];
       
        for(int i = 0 ; i < costs.length ; i++) {
            if(costs[i] > max) {
                max = costs[i];
            }
        }

        int[]count = new int[max+1];

        for(int i = 0 ; i < costs.length; i++) {
            count[costs[i]]++;
        }

        int index = 0;
        for(int i = 0 ; i <= max ; i++) {
            while(count[i] > 0) {
                costs[index++] = i;
                count[i]--;
            }
        }

        int iceCream = 0;

        for(int i = 0 ; i < costs.length ; i++) {

            if(coins <= 0) {
                break;
            }
            if(coins >= costs[i]) {
                iceCream++;
                coins = coins - costs[i];
            }
            
        }

        return iceCream;
    }
}