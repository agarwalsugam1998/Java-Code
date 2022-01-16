class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        ArrayList<Boolean> ans = new ArrayList<>();    
        int max_no = max(candies);
        for(int i=0;i<candies.length;i++)
        {
            int after_extraCandy = candies[i] + extraCandies;
            boolean res = check(after_extraCandy,max_no);
            ans.add(res);
        }
        return ans;
             
    }
    public static int max(int[] arr)
    {
        int largest = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        return largest;
        
    }
    public static boolean check(int a, int large_No)
    {
        return a>=large_No;
    }
}
