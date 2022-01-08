/******************************************************************************

          Occurences of a digit in a number

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    int a = 13839;
    int occurence_of_3 = 0;
    int check_for_no = 3;
    while(a>0)
    {
        int rem = a%10;
        if(rem==check_for_no)
        {
            occurence_of_3++;
        }
        a = a/10;
    }
    
System.out.println(occurence_of_3);
    
    
    


  }
}
