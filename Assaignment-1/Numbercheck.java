
package numbercheck;

public class Numbercheck {
    public static void main(String[] args) 
    {
        double number = -25.0;
        if(number>0)
        {
            System.out.println(number+ " is posive.");
        }
        else if (number<0)
        {
            System.out.println(number + " is Negative.");
        }
        else
            System.out.println("The number is zero." +number);
    }
    
}
