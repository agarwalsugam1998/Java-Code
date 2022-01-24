import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	  int n = 5;
	 
	 System.out.println(Arrays.toString(sumZero(n)));
	}
	public static int[] sumZero(int n) 
	{
     int[] res = new int[n];
     ArrayList<Integer> list = new ArrayList<Integer>();
     if(n%2==0)
     {
         
         int no = n/2;
        
         while(no>0)
         {
             list.add(no);
             int x = no * -1;
             list.add(x);
             no--;
         }
         
         
     }
     else
     {
        list.add(0);
        n = n-1;
          int no = n/2;
        
         while(no>0)
         {
             list.add(no);
             int x = no * -1;
             list.add(x);
             no--;
         }
         
         
        
     }
    for(int i=0;i<list.size();i++)
    {
        res[i] = list.get(i);
    }
     return res;
     
    }
}
