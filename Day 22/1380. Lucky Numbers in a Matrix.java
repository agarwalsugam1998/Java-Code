class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) 
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
       
        
       // System.out.println("Second Operation");
        int[][] mat = transpose(matrix);
        // System.out.println(Arrays.toString(mat));
        
        int[] arr_2 = new int[mat.length];
        int l2 = mat.length;
         for(int i=0;i<mat.length;i++)
        {
            int max = mat[i][0];
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]>max)
                {
                    max = mat[i][j];
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
                   //System.out.print(arr_1[i]);
                }
            }
        }
        return list;
    }
     public static int[][] transpose(int[][] matrix) {
    int[][] ans = new int[matrix[0].length][matrix.length];
        
        for(int row =0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                ans[col][row] = matrix[row][col];
            }
        }
       return ans;    
    
    }
}
