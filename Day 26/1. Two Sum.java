class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       int[] ans = new int[2];
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            temp[i] = nums[i];
        }
        //System.out.println(Arrays.toString(temp));
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int sum = nums[start] + nums[end];
            if(sum == target)
            {
                //return new int[]{start,end};
                //System.out.print(start);
                //System.out.print(end);
                a = nums[start];
                b = nums[end];
                //System.out.print(a);
                //System.out.print(b);
                break;
            }
            else if(sum > target)
            {
                 end--;
            }
            else
            {
                 start++;
            }
            
        }
         
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==a)
            {
                ans[0] = i;
                               

                break;
            }
        }
        for(int i = temp.length-1; i>=0;i--)
        {
            if(temp[i]==b)
            {
                ans[1] = i;
                break;
            }
        }
       return ans; 
    }
}
