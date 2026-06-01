class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total_cost = 0;
        int mincost = 0;
        for(int i = 0 ; i < cost.length ; i++) {

            total_cost = total_cost + cost[i];
        }

        for(int i = cost.length - 3 ; i >= 0 ; i=i-3) {

            mincost = mincost + cost[i] ;
        }

        return total_cost - mincost;
    }
}