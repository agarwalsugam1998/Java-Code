/******************************************************************************
             Rotation Count in Rotated Sorted Array

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {15, 18, 2, 3, 6, 12};
	    System.out.println(rotationCount(arr));
	}
	
	public static int rotationCount(int[] nums)
	{
	    return Pivot(nums)+1;
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
