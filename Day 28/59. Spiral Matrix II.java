class Solution {
    public int[][] generateMatrix(int n) {
         int[][] matrix = new int[n][n];
       ArrayList<Integer> list = new ArrayList<>();
       	for(int i=1;i<=n*n;i++)
		{
		   list.add(i);
		}
		int c = 0;
       int row_start = 0;
       int row_end = matrix.length - 1;
       int col_start = 0;
       int col_end = matrix[0].length - 1;
       while(row_end<=row_end && col_start<=col_end)
       {
           for(int i=col_start;i<=col_end;i++)
           {
               matrix[row_start][i] = list.get(c);
               c++;
           }
           row_start++;
           
           
           for(int i=row_start;i<=row_end;i++)
           {
               matrix[i][col_end] = list.get(c);
               c++;
           }
           col_end--;
           
           if(row_start<=row_end)
           {
           for(int i=col_end;i>=col_start;i--)
           {
               matrix[row_end][i] = list.get(c);
               c++;
           }
          }
        row_end--;
        if(col_start<=col_end)
        {
            for(int i = row_end;i>=row_start;i--)
            {
                matrix[i][col_start] = list.get(c);
                c++;
            }
        }
           
           col_start++;
       }
      // System.out.println(list);
	
	    /* for(int[] arr : matrix)
	     {
	         System.out.println(Arrays.toString(arr));
	     }*/
       
       
       
       return matrix;
        
    }
}
