class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int end = num.length - 1;
        while(end>=0 || k>0)
        {
            if(end>=0)
            {
                int val = num[end] + k;
                ans.add(val%10);
                k = val/10;
                end--;
            }
            else
            {
                int val = k%10;
                ans.add(val);
                k=k/10;
                
            }
        }
       for(int i = ans.size()-1;i>=0;i--)
       {
              int val = ans.get(i);
              res.add(val);
       }
        return res;
         
    }
}
