class Solution {
    public int maxSubArray(int[] nums) {
        int max_s_f = Integer.MIN_VALUE;
      int max_e_h = 0;
      for(int i=0;i<nums.length;i++)
      {
           max_e_h = max_e_h + nums[i];
          if(max_s_f<max_e_h)
          {
              max_s_f = max_e_h;
          }
          if(max_e_h<0)
          {
              max_e_h = 0;
          }
      }
      //System.out.println(max_s_f);
      return max_s_f;
    }
}
