//1252. Cells with Odd Values in a Matrix

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int m = 2;
		int n = 2;
		int[][] matrix = new int[m][n];
		int[][] indices = {{1,1},{0,0}};
		initializeMatrix(matrix);
		show(matrix);
		operations(matrix,indices);
		show(matrix);
		System.out.println(countOdd(matrix));
	}
	public static void show(int mat[][])
    {
      
        for (int[] row : mat){
 
            
            System.out.println(Arrays.toString(row));}
    }
    
	public static void initializeMatrix(int image[][])
	{
	     for(int row=0;row<image.length;row++)
	   {
	    
	      for(int j=0;j<image[row].length;j++)
	      {
	          image[row][j] = 0;
	      }
	  
	   } 
	}
	public static void operations(int image[][], int[][] index)
	{
	     boolean isRow=false;
	     for(int row=0;row<index.length;row++)
	   {
	    
	      for(int j=0;j<index[row].length;j++)
	      {
	          int val = index[row][j];
	          if(j==0)
	          {
	              isRow=true;
	          }
	          if(j>0)
	          {
	              isRow=false;
	          }
	          innerOperations(image,val,isRow);
	      }
	  
	   } 
	}
	public static void innerOperations(int image[][],int val,boolean isRow)
	{
	 if(isRow)
	 {
	     for(int i=0;i<image[val].length;i++)
	     {
	         image[val][i]++;
	     }
	 }
	 else
	 {
	   for(int i=0;i<image.length;i++)
	   {
	       image[i][val]++;
	   }
	 }
	}
	
	
		public static int countOdd(int image[][])
	{
	    int count=0;
for(int row=0;row<image.length;row++)
	   {
	    
	      for(int j=0;j<image[row].length;j++)
	      {
	          int val = image[row][j];
	          if(val%2!=0)
	          {
	              count++;
	          }
	         
	      }
	  
	   }
	   return count;
	}
	
}
