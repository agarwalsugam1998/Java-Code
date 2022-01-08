/******************************************************************************

   Checking UpperCase or LowerCase 

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	char a = input.next().trim().charAt(0);
	if(a>= 'a' && a<='z')
	{
	    System.out.println("LowerCase");
	}
	else
	{
	    System.out.println("UpperCase");
	}
	
		 
		 
	}
}
