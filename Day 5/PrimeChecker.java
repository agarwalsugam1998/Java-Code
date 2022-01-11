
import static java.lang.System.in;
 class Prime {
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
public static void checkPrime(int... v)
{
 
    for(int num:v)
    {
        if(isPrime(num))
        {
          System.out.print(num + " ");
        }
        
    }
System.out.println();    

}}
