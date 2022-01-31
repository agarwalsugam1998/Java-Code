class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col != r*c)
        {
           return mat;
        }
        int[][] reshape = new int[r][c];
        int p=0;
        int q=0;
        for(int i=0;i<r;i++)
        {
           for(int j=0;j<c;j++)
           {
               reshape[i][j] = mat[p][q];
               if(q==col-1)
               {
                   p++;
                   q=0;
               }
               else
               {
                   q++;
               }
           }
           
        }
        return reshape;
    }
}
