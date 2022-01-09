class Solution {
    public int subtractProductAndSum(int n) {
        
        int prod = n;
        int sum = n;
        // For Product 
        
    int product = 1;
    int sum_of_digit = 0;
        while(prod>0)
    {
     int temp = prod%10;
     product = product*temp;
    prod = prod/10;
    }
        while(sum>0)
        {
           int temp = sum%10;
         sum_of_digit = temp+sum_of_digit;
            sum = sum/10;
        }
        
        
        return product-sum_of_digit;
        
    }
}
