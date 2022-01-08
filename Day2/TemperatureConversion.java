import java.util.Scanner;
public class Main {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp. in Celcius: ");
        float temp_celcius = input.nextFloat();
        float temp_far = (temp_celcius*9/5) + 32;
        System.out.println("Temp is " + temp_far + "F");
        
    }
    
    
}
