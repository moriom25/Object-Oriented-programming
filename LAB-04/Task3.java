
package task3;

public class Task3{
    public static void main(String[] args) {
        String str = "moriom";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println(str + " is a Palindrome.");
        else
            System.out.println(str + " is NOT a Palindrome.");
    }
}
