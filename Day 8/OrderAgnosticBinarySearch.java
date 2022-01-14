/******************************************************************************

                       Order Agnostic Binary Search 

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
	    int[] arr = {50,40,30};
	    int target = 40;
	    int ans = orderAgnosticBS(arr,target);
	    System.out.println(ans);
	}
	
	public static int orderAgnosticBS(int[] arr, int t)
	{
	    
	    if(arr.length == 0)
	    {
	        return -1;
	    }
	    int start = 0;
	    int end = arr.length - 1;
	    boolean isAsc = arr[start] < arr[end];
	    while(start<=end)
	    {
	        int mid = start + (end-start)/2;
	        if(arr[mid]==t)
	        {
	            return mid;
	        }
	        else if (isAsc)
	        {
	            if(t>arr[mid])
	            {
	                start = mid+1;
	            }
	            else{
	                end = mid-1;
	            }
	        }
	        else{
	            if(t<arr[mid])
	            {
	                start = mid+1;
	            }
	            else{
	                end = mid-1;
	            }
	        }

	    }
	    return -1;
	    
	}
	
	
	
	
	
}
