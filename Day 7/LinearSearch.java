/******************************************************************************

                                 Linear Search Code in 1D & 2D Array
                                 
*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {10,20,4,5,6,8,100};
		int[][] arr2d = {
		    
		    {23,44,76},
		    {12,90,66},
		    {100,200}
		    
		    
		};
		int target = 40;
		int target2d = 66;
		int ans = linearSearch(arr,target);
		int[] ans2d = linearSearch2d(arr2d,target2d);
		System.out.println(ans);
		System.out.println(Arrays.toString(ans2d));
	}
	
	public static int linearSearch(int[] arr, int a)
	{
	    if(arr.length == 0)
	    {
	        return -1;
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==a)
	        {
	            return i;
	        }
	    }
	    return -1;// it means above 2 return statement doesnt run!
	    
	    
	}
	
	public static int[] linearSearch2d(int[][] arr, int t)
	{
	    if(arr.length==0)
	    {
	        return new int[]{-1,-1};
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=0;j<arr[i].length;j++)
	        {
	            if(t == arr[i][j])
	            {
	                return new int[]{i,j};
	            }
	        }
	    }
	    return new int[]{-1,-1};
	}
	
	
	
	
	
}
