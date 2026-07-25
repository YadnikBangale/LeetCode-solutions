class Solution {
    public int maxProduct(int n) {
        
        int digits[] = new int[10];
        int i = 0;
        while(n > 0) {

            digits[i] = n % 10;
            n /= 10;
            i++;
        }

        //[1,3]

        int maxProd = digits[0];
        int prod = digits[0];

        for(int j = 0 ; j < digits.length ; j++) {
            for(int k = j+1 ; k < i; k++) {

                prod = digits[j]*digits[k];
                if(prod > maxProd) {
                maxProd = prod;
            }
            }

            
        }

        return maxProd;

    }
}