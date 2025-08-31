
package lanternparade;

public class Lanternparade {
public static void main (String [] args) 
    {
        int n = 10;
        int sum = 0;
        int odd; 
        System.out.print("The Odd Numbers Are: ");
        for (int i=1; i<=n; i++)
        {
      odd = 2*i-1;
        System.out.print(odd+ " ");
         sum = sum+odd;
        }
        System.out.println ();
        System.out.println("The Sum of Odd Natural Number Upto " +n+ " Terms: " + sum);
    }  
}
