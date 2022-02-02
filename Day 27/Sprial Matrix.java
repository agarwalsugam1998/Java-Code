/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	 spiralOrder(matrix);
	 
	}
	 public static void spiralOrder(int[][] matrix) 
	 {
     
     ArrayList<Integer> list = new ArrayList<>();
      ArrayList<Integer> list_ans = new ArrayList<>();
     int star_row = 0;
     int end_row = matrix.length;
     int star_col = 0;
     int end_col = matrix[0].length;
     while(star_row<end_row && star_col<end_col)
     {
     for(int j=star_col;j<end_col;j++)
     {
         list.add(matrix[star_row][j]);
         
     }
     
	 star_row++;
	 
	     for(int i=star_row;i<matrix.length;i++)
	     {
	         list.add(matrix[i][end_col-1]);
	        
	     }
	 
	 end_col--;
	
	 if(star_row<end_row)
	 {
	 
	     for(int j=end_col-1;j>=star_col;j--)
	     {
	         list.add(matrix[end_row-1][j]);
	         
	     }
	 
	 end_row--;
	 }
	 
	 if(star_col<end_col)
	 {
	
	     for(int j=end_row-1;j>=star_row;j--)
	     {
	         list.add(matrix[j][star_col]);
	     }
	 
	 
	     star_col++;
	 }
	 
    }
    for(int i=0;i<list.size()-1;i++)
    {
        list_ans.add(list.get(i));
    }
    //System.out.println(list_ans);
    return list_ans;
	 }
    
}
