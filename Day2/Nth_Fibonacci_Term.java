/******************************************************************************

   Fibonacci Number

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int nth_fibo=0;
		for(int i=3;i<=n;i++)
		{
		    if (i<=3)
		    {
		    nth_fibo = a+b;
		    }
		    if(i>3)
		    {
		        a = b;
		        b = nth_fibo;
		        nth_fibo = a+b;
		    }
		}
		System.out.println(nth_fibo);
	}
}
