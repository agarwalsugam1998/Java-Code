class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max_wealth=Integer.MIN_VALUE;
      
        // calculating the max wealth 
        
        for(int i=0;i<accounts.length;i++)
        {
         int sum=0;
            for(int j=0;j<accounts[i].length;j++)
         {
            sum = sum+accounts[i][j];
         }
            if(sum>max_wealth)
            {
                     max_wealth = sum;
            }
        }
        
       return max_wealth;
        
    }
}
