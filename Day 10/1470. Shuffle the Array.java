class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int j = 0;
        for(int i=0;i<nums.length && j<res.length; i++)
        {
           res[j] = nums[i];
            j++;
            res[j] = nums[n+i];
            j++;
        
        }
        return res;        
    }
}
