/******************************************************************************
                    Ceiling & Floor of Array using Binary Search

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int arr[] = {12,14,25,54,300,900};
		int target = 1000;
		int ceiling = ceilingArray(arr,target);
		int floor = floorArray(arr,target);
		System.out.println("ceiling: "+ceiling);
		System.out.println("floor: "+floor);
	}
	
	public static int ceilingArray(int arr[], int t)
	{
	    int start = 0;
	    int end = arr.length - 1;
	    // if target is the largest no in the array 
	    if(t>arr[end])
	    {
	        return -1;
	    }
	    while(start<=end)
	    {
	        int mid = start + (end-start)/2;
	        if(t>arr[mid])
	        {
	            start = mid+1;
	        }
	        else if(t<arr[mid])
	        {
	            end = mid-1;
	        }
	        else{
	            return mid;
	        }
	    }
	    return start;
	}
	
	
	public static int floorArray(int arr[], int t)
	{
	    int start = 0;
	    int end = arr.length - 1;
	    if(t<arr[start])
	    {
	        return -1;
	    }
	    
	    
	    
	    while(start<=end)
	    {
	        int mid = start + (end-start)/2;
	        if(arr[mid]==t)
	        {
	            return mid;
	        }
	        else if (t>arr[mid])
	        {
	            start = mid+1;
	        }
	        else{
	            end = mid-1;
	        }
	    }
	    return end;
	}
	
	
}
