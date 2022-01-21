class Solution {
    public int diagonalSum(int[][] mat) 
    {
        return diagonalsum(mat);
    }
    	public static int diagonalsum(int[][] mat)
	{
	    int primary_diag=0;
	    int secondary_diag=0;
	    int start = -1;
	    int end = mat.length;
	    int p;
	    int s;
	    for(int row = 0;row<mat.length;row++)
	    {
	        p=0;
	        s=0;
	        start++;
	        end--;
	        p = p + mat[row][start];
	        if(start!=end)
	        {
	            s = s + mat[row][end];
	        }
	        primary_diag = primary_diag + p;
	        secondary_diag = secondary_diag + s;
	    }
	
	    return primary_diag+secondary_diag;
	}
}
