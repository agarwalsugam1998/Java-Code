/******************************************************************************

            LeetCode Hard: 1095. Find in Mountain Array

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int arr[] = {};
		int t = 89;
		int ans = search(arr,t);
	}
	
  public static int search(int[] arr, int target)
  {
	
	int peak = peakIndexInMountainArray(arr);
	int firstTry = orderAgnosticBS(arr,target,0,peak);
	if(firstTry!=-1)
	{
	    return firstTry;
	}
	else
	{
	    int h = peak+1;
	    int secondTry = orderAgnosticBS(arr,target,h,end);
	    return secondTry;
	}
  }
	
	 public int peakIndexInMountainArray(int[] arr) 
    {
      int start = 0;
      int end = arr.length - 1;
      while(start<end)
      {
          int mid = start + (end-start)/2;
          if(arr[mid]>arr[mid+1])
          {
              // i am in the decreasing part, means ans will lie in the right
              end = mid;
          }
          else
          {
                  start = mid+1;
          }
      }
        return start;
    }
    
    public static int orderAgnosticBS(int[] arr, int t, int s, int e)
	{
	    
	    if(arr.length == 0)
	    {
	        return -1;
	    }
	    int start = s;
	    int end = e;
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
