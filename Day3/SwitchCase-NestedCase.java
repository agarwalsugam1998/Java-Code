/******************************************************************************

                           Basic Switch Cases 
                           
                    
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    String figure = input.next().trim();
	    String formula = input.next().trim();
	    switch(figure)
	    {
	        case "Triangle":
	            System.out.println("3 sides");
	            break;
	        case "Square":
	            System.out.println("4 sides");
	            switch(formula)
	            {
	                case "Perimeter":
	                    System.out.println("Sum of all sides");
	                    break;
	               case "Area":
	                   System.out.println("Side X Side");
	                   break;
	               default:
	               System.out.println("Enter Valid Choice");
	            }
	            break;
	       case "Circle":
	           System.out.println("No sides");
	           break;
	       case "Octagon":
	           System.out.println("8 sides");
	           break;
	       default:
	           System.out.println("Enter the valid choice from (Triangle, Square, Circle, Octagon) ");
	    }
	    
	}
}
