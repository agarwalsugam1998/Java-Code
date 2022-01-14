/******************************************************************************

                       Binary Search On Asc & Dsc Array 

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
	    int[] arr = {10,20,30,40,50,60};
	    int[] drr = {60,50,40,30,20,10};
	    int targetAsc = 40;
	    int targetDsc = 40;
	    int ansAsc = binarySearchAsc(arr,targetAsc);
	    int ansDsc = binarySearchDsc(drr,targetDsc);
	    System.out.println("Ascending is called: "+ ansAsc);
	    System.out.println("Descending is called: "+ansDsc);
	}
	
	public static int binarySearchAsc(int[] arr, int t)
	{
	    
	    if(arr.length == 0)
	    {
	        return -1;
	    }
	    int start = 0;
	    int end = arr.length - 1;
	    while(start<=end)
	    {
	        int mid = start + (end-start)/2;
	        if(t>arr[mid])
	        {
	            start = mid+1;
	        }
	        else if (t<arr[mid])
	        {
	            end = mid - 1;
	        }
	        else
	        {
	           return mid;    
	        }
	    }
	    return -1;
	    
	}
	
	
	
		public static int binarySearchDsc(int[] arr, int t)
	{
	    
	    
	    if(arr.length == 0)
	    {
	        return -1;
	    }
	    int start = 0;
	    int end = arr.length - 1;
	    while(start<=end)
	    {
	        int mid = start + (end-start)/2;
	        if(t>arr[mid])
	        {
	            end = mid-1;
	        }
	        else if (t<arr[mid])
	        {
	            start = mid + 1;
	        }
	        else
	        {
	           return mid;    
	        }
	    }
	    return -1;
	    
	}
	
	
	
	
}
