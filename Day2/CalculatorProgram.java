/******************************************************************************

     Calculator Program 

*******************************************************************************/

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    //Ask for a operator 
      
    int res = 0;
    while (true)
      {
          System.out.println ("Enter the operator: ");
    char c = input.next ().trim ().charAt (0);
      System.out.println ("Enter the 2 Numbers: ");
    int a = input.nextInt ();
    int b = input.nextInt ();
          
	if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%')
	  {

	    if (c == '+')
	      {
		res = a + b;
	      }
	    if (c == '-')
	      {
		res = a - b;
	      }
	    if (c == '*')
	      {
		res = a * b;
	      }

	    if (c == '/')
	      {

		if (b > 0)
		  {
		    res = a / b;
		  }
	      }

	    if (c == '%')
	      {
		res = a % b;
	      }
	      	System.out.println (res);

	  }
	else if (c == 'x' || c == 'X')
	  {
	    break;
	  }
	else
	  {
	    System.out.println ("Invalid Operator");
	  }



      }



  }
}
