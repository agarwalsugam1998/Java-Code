/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		int[][] mat = {{0,1},{1,1}}; 
		int[][] target = {{1,0},{0,1}};
		boolean ans = false;
		for(int i=0;i<4;i++)
		{
		
		    
		    if(check(mat,target))
		    {
		        ans = true;
		        break;
		    }
		    rotation(mat);
		}
		System.out.println(ans);
	}
	public static boolean check(int[][] mat, int[][] target)
	{
	    for(int i=0;i<mat.length;i++)
	    {
	        for(int j=0;j<mat[i].length;j++)
	        {
	            if(mat[i][j]!=target[i][j])
	            {
	              
	                return false;
	            }
	        }
	    }
	    return true;
	}
	 public static void transpose(int[][] matrix) {
    int[][] ans = new int[matrix[0].length][matrix.length];
        
         for(int row =0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                ans[col][row] = matrix[row][col];
            }
        }
          
     for(int row =0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                matrix[row][col] = ans[row][col];
            }
        }
      
    }
    public static void rotation(int[][] mat)
    {
       transpose(mat);
        int start = 0;
        int end = mat.length - 1;
        while(start<=end)
            {
                
                for(int i=0;i<mat.length;i++)
              {
            
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                
            }
            start++;
            end--;
            
        }
       
    }
}
