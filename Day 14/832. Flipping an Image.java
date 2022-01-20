class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
     reverseArray(image); 
      flipArray(image);
        return image;
    }
    	public static void reverseArray(int[][] image)
	{
	   
	   for(int row=0;row<image.length;row++)
	   {
	      int start = 0;
	      int end = image[row].length-1;
	      while(start<end)
	      {
	          int val = image[row][start];
	          image[row][start] = image[row][end];
	          image[row][end] = val;
	          start++;
	          end--;
	          
	      }
	  
	   } 
	}
    	public static void flipArray(int[][] image)
	{

	   for(int row=0;row<image.length;row++)
	   {
	    
	      for(int j=0;j<image[row].length;j++)
	      {
	          int val = image[row][j];
	          if(val==1)
	          {
	              image[row][j] = 0;
	          }
	          if(val==0)
	          {
	              image[row][j] = 1;
	          }
	      }
	  
	   } 
	}
    
}
