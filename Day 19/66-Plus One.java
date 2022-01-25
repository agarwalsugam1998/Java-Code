/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	int[] arr = {9};
	System.out.println(Arrays.toString(plusOne(arr)));
	}
	public static int[] plusOne(int[] digits) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int end = digits.length-1;
        int k = 1;
        while(end>=0 || k>0)
        {
            if(end>=0)
            {
            int sum = digits[end] + k; 
            list.add(sum%10);
            k = sum/10;
            end--;
            }
            else
            {
               int val = k%10;
               list.add(val);
               k = k/10;
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for(int i=list.size()-1;i>=0;i--)
        {
            res[index] = list.get(i);
            index++;
        }
        return res;
    }
}
