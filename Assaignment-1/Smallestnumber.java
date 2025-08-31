
package smallestnumber;
public class Smallestnumber {

        public static void main(String[] args)
    {
        double num1 = 15.5;
        double num2 = 7.8;
        double num3 = 12.3;
        double Smallest;
        if (num1<=num2 && num1<=num3)
        {
            Smallest= num1;
        }
        else if(num2<=num1 && num2<=num3)
        {
            Smallest = num2;
        }
        else
        {
            Smallest = num3;
        }
        System.out.println("The Smallest Number is: " +Smallest);
    }
   }
