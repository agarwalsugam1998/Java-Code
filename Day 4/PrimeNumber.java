/******************************************************************************

           Prime Number 
           
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean check = isPrime(num);
		System.out.println(check);
	}
	
	public static boolean isPrime(int x)
	{
	    if(x<=1)
	    {
	        return false;
	    }
	    else
	    {
	       int c = 2;
	       while(c*c<=x)
	       {
	           if(x%c==0)
	           {
	               return false;
	           }
	           c++;
	       }
	       return c*c>x;
	       
	    }
	}
}
