/******************************************************************************

                     Search in String

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String s = "Sugam";
		char target = 'u';
	    System.out.println(linearSearch1(s,target));
	}
	
	public static boolean linearSearch(String sw, char l)
	{
	    if(sw.length()==0)
	    {
	        return false;
	    }
	    for(int i=0;i<sw.length();i++)
	    {
	        if(sw.charAt(i)==l)
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	
	
	
	
	public static boolean linearSearch1(String sw, char l)
	{
	    if(sw.length()==0)
	    {
	        return false;
	    }
	    for(char ch:sw.toCharArray())
	    {
	        if(ch==l)
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
