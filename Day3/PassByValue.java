/******************************************************************************

    1. Passing Through Primitives:- Pass By Value (Original Things Usme koi Change Nahi Hota)
    2. Passing Through Refrences:- Pass By Value (Original Things Mein Change HOta Hai)
*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		change(arr);
		System.out.println(arr[0]);
	}
	
	public static void change(int[] nums)
	{
	  nums[0] = 100;   
	}
	
	
}
