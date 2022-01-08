/******************************************************************************

  Max of 3 Numbers 

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);
    int a = input.nextInt ();
    int b = input.nextInt ();
    int c = input.nextInt ();
    
    int max =  a;
    if(b>max)
    {
        max = b;
    }
    if(c>max)
    {
        max = c;
    }
System.out.println(max);
  }
}
