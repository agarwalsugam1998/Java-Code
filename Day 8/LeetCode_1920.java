class Solution {
    public int[] buildArray(int[] nums) 
    {
      int n = nums.length;
      int[] ans = new int[n];
      for(int i=0;i<nums.length;i++)
      {
         int temp1 = originalValue(nums,i);
         int temp2 = originalValue(nums,temp1);
         ans[i] = temp2;
      }
        return ans;
    }
    
    public static int originalValue(int[] arr,int x)
    {
      return arr[x];
    }
}
