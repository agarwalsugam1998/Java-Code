/******************************************************************************
                             LCM & HCF

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		int a = 9;
		int b = 81;
		lcm(a,b);
		//System.out.println("------");
		hcf(a,b);
	}
	public static void lcm(int a, int b)
	{
	    System.out.print("LCM is:");
	    int max_lcm = a*b;
	    int max_no = Math.max(a,b);
	    while(max_no<=max_lcm)
	    {
	        if(max_no%a ==0 && max_no%b==0)
	        {
	            break;
	        }
	        else{
	            max_no++;
	        }
	    }
	    System.out.println(max_no);
	}
	public static void hcf(int a, int b)
	{
	    
	    System.out.print("HCF is:");
	    int max_hcf = Math.min(a,b);
	    int hcf_no = 0;
	    for(int i = max_hcf;i>=1;i--)
	    {
	        if(a%i==0 && b%i==0)
	        {
	            hcf_no = i;
	            break;
	        }
	       
	    }
	    System.out.println(hcf_no);
	}
}
