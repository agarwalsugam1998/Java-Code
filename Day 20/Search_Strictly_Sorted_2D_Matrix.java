/******************************************************************************

                      Binary Search in Strictly Sorted Array

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) 
	{
	      int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toStrings(searchStrictly(arr,target)));
	}
    public static int[] searchStrictly(int[][] arr, int t)
    {
        //colums select karoonga 
        // rows eliminate karoonga 
        
        // selecting the middle column
        int rows = arr.length;
        int cols = arr[0].length;
        int mid_col = cols/2;
        // define row start and row end 
        int rstart = 0;
        int rend = rows - 1;
        // apply BS on selected row and column 
        while(rstart<(rend-1))
        {
            if(rows == 1)
            {
                return binarySearch(arr,0,0,cols-1,t);
            }
            int mid = rstart + (rend-rstart)/2;
            if(arr[mid][mid_col] == t)
            {
                return int[]{mid,mid_col};
            }
            else if (arr[mid][mid_col] < t)
            {
                rstart = mid;
            }
            else
            {
              rend = mid;   
            }
        }
        
        // only 2 rows remaining :
        
        if(arr[rstart][mid_col]==t)
        {
            return new int[]{rstart,mid_col};
        }
        if(arr[rstart+1][mid_col]==t)
        {
            return new int[]{rstart,mid_col};
        }
        
        
        return new[] {-1,-1};
    }
    public static int[] binarySearch(int[][] arr, int row, int colstart, int colend, int t)
    {
        
    }
}
