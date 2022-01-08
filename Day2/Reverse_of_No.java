/******************************************************************************

              reverse of a number 

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// int n = 12345 
		// int rev = 54321
		
		int rev = 0;
		while(n>0)
		{
		    int rem = n%10;
		    rev = rev*10 + rem;
		    n = n/10;
		}
		
		
		System.out.println(rev);
	}
}
