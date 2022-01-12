/******************************************************************************

                            Swapping the Index-Elements of an Array
                            Maximum element of Array
                            
*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,4};
		System.out.println(Arrays.toString(arr));
		  System.out.print("Swapping Func is called: ");
		swap(arr,1,2);// index1 = 2 & index2 = 3 
		System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int index1, int index2)
		{
		  
		    int a = arr[index1];
		    arr[index1] = arr[index2];
		    arr[index2] = a;
		}
		
	public static int max(int[] arr)
		{
		    System.out.print("Maximum Func is called: ");
		    int max = arr[0]; // lets say 
		    for(int i=0;i<arr.length;i++)
		    {
		        if(arr[i]>max)
		        {
		            max = arr[i];
		        }
		    }
		    return max;
		    
		}
		
	public static void reverse(int[] arr)
	{
	    System.out.print("Reverse Func is callled: ");
	    int start = 0;
	    int end = arr.length - 1;
	    while(start<end)
	    {
	    swap(arr,start,end);
	    start++;
	    end--;
	        
	    }
	        
	    }
		
		
		
		
		
		
		
		
}
