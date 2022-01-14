class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        n = 2*n;
        int[] ans = new int[n];
        int counter = 0; 
        for(int i=0;i<nums.length;i++)
        {
           ans[i] = nums[i];
           counter++;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[counter] = nums[i]; 
            counter++;
        }
        
        return ans;
    }
}
