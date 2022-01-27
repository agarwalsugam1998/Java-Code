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
        int target = 9;
        System.out.println(Arrays.toString(searchStrictly(arr,target)));
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
        
         if(rows == 0)
            {
                return binarySearch(arr,0,0,cols-1,t);
            }
         if(cols == 0)
            {
                return new int[]{-1,-1};
            }
        
        
        
        int rstart = 0;
        int rend = rows - 1;
        // apply BS on selected row and column 
        while(rstart<(rend-1))
        {
           
            int mid = rstart + (rend-rstart)/2;
            if(arr[mid][mid_col] == t)
            {
                return new int[]{mid,mid_col};
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
        //part 1 
        if(arr[rstart][mid_col]==t)
        {
            return new int[]{rstart,mid_col};
        }
        if(arr[rstart+1][mid_col]==t)
        {
            return new int[]{rstart+1,mid_col};
        }
        //part 2 
        if(t<=arr[rstart][mid_col-1])
        {
            return binarySearch(arr,rstart,0,mid_col-1,t);
        }
        //part 3 
        if(t>=arr[rstart][mid_col+1] && t <= arr[rstart][cols - 1])
        {
            return binarySearch(arr,rstart,mid_col+1,cols-1,t);
        }
        //part 4
         if(t<=arr[rstart+1][mid_col-1])
        {
            return binarySearch(arr,rstart+1,0,mid_col-1,t);
        }
        //part 5 
        else
        {
            return binarySearch(arr,rstart+1,mid_col+1,cols-1,t);
        }
        
        
      
    }
    public static int[] binarySearch(int[][] arr, int row, int colstart, int colend, int t)
    {
       while(colstart<=colend)
       {
           int mid = colstart + (colend-colend)/2;
           if(t == arr[row][mid])
           {
               return new int[]{row,mid};
           }
           else if(t>arr[mid][row])
           {
               colstart = mid+1;
           }
           else{
               colstart = mid-1;
           }
       
       }
       return new int[]{-1,-1};
    }
}
