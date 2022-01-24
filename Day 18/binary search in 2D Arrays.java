/******************************************************************************

                   binary search in 2D Arrays 

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		int[][] twoDSorted = {
		    {10,20,30,40},
		    {15,25,35,45},
		    {28,29,37,49},
		    {33,34,38,50}
		};
	  int target = 50;
	    System.out.println(Arrays.toString(searchT(twoDSorted,target)));
	}
	public static int[] searchT(int[][] mat, int t)
	{
	    int r = 0;
	    int c = mat.length - 1;
	    while(r<mat.length & c>=0)
	    {
	        if(mat[r][c]==t)
	        {
	            return new int[]{r,c};
	            
	        }
	        else if(t<mat[r][c])
	        {
	            c--;
	        }
	        else
	        {
	             r++;    
	        }
	    }
	    return new int[]{-1,-1};
	}
}
