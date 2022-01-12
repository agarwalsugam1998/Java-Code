import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();// Declaration part
        int no_of_lines = input.nextInt();
        for(int i=0;i<no_of_lines;i++)// Initialisation part 
        {
            list.add(new ArrayList());
        }
        
        
          for(int i=0;i<no_of_lines;i++)// taking input for lines integer 
        {
            int no_of_lines_int  = input.nextInt();
            for(int j=0;j<no_of_lines_int;j++)
            {
                list.get(i).add(input.nextInt());
            }
            
        }
        
        
    int no_of_queries = input.nextInt();
    
    for(int i=0;i<no_of_queries;i++)
    {
        int x = input.nextInt();
        x = x-1;
        int y = input.nextInt();
        y = y-1;
        int no_of_inner_list = list.size()-1;
        if(x<=no_of_inner_list)
        {
            int no_elements_inner_each_list = list.get(x).size()-1;
            if(y<=no_elements_inner_each_list)
            {
            int res = list.get(x).get(y); 
              System.out.println(res); 
            }
            else 
            {
                System.out.println("ERROR!");
            }
        }
        else
        {
            System.out.println("ERROR!");
        }
       
       
        
        }
    }
}
    
    
        
        
        
        
        
        
        
        
    
