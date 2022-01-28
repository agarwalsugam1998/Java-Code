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
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		luckyNumbers(matrix);
	}
	 public static void luckyNumbers (int[][] matrix) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr_1 = new int[matrix.length];
        int l1 = matrix.length;
        for(int i=0;i<matrix.length;i++)
        {
            int min = matrix[i][0];
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min = matrix[i][j];
                }
            }
            arr_1[i] = min;
         
        }
        transpose(matrix);
        int[] arr_2 = new int[matrix.length];
        int l2 = matrix.length;
         for(int i=0;i<matrix.length;i++)
        {
            int max = matrix[i][0];
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]>max)
                {
                    max = matrix[i][j];
                }
            }
            arr_2[i] = max;
         
        }
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(arr_1[i]==arr_2[j])
                {
                    list.add(arr_1[i]);
                   System.out.print(arr_1[i]);
                }
            }
        }
        //return list;
        
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
}
