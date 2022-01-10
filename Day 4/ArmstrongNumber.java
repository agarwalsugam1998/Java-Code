/******************************************************************************

              Armstrong Number 

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean check = isArmstrong(num);
		System.out.println(check);
	}
	
	
	
	public static boolean isArmstrong(int x)
	{
	    int org_no = x;
	    int sum = 0;
	    while(x>0)
	    {
	        int temp = x%10;
	         sum = sum + (temp*temp*temp);
	         x = x/10;
	    }
	    if(sum==org_no)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	    
	    
	}
}
