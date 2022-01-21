class Solution {
    public int findNumbers(int[] nums) {
        
        int res = 0;
        if(nums.length == 0)
        {
               return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
             int no_of_digit = totalDigit(nums[i]);
             if(no_of_digit%2==0)
             {
               res++;
             }
        }
        return res;
        
    }
    
    public static int totalDigit(int a)
    {
        int temp = 0;
        while(a>0)
        {
          temp++;
            a = a/10;
        }
        return temp;
        
    }
    
    
}
