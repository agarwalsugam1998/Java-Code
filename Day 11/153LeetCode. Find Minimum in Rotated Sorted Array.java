class Solution {
    public int findMin(int[] nums) 
    
    {
        int pivot = Pivot(nums);
        if(pivot==-1)
        {
            return nums[0];
        }
        else
        {
            return nums[pivot+1];
        }
    }
      public static int Pivot(int[] arr)
    {
      
        int start = 0;
        int end = arr.length - 1;
       
        
         
       while(start<=end)
       {
         int mid = start + (end-start)/2;
           if(mid<end&&arr[mid]>arr[mid+1] )
        {
            
            return mid;
        }
        if( mid>start&&arr[mid-1]>arr[mid] ) //case 2 
        {
            
            return mid-1;
        }
        
        if(arr[start]>=arr[mid])//case 4 
        {
               end = mid-1;
        }
           else
           {
               start = mid+1;
           }
       }
        return -1;
        
    }
}
