import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char first_Value = scanner.next().charAt(0);  

        System.out.print("Enter second character: ");
        char second_Value = scanner.next().charAt(0);  
        
        char greater_Value = (char) Math.max(first_Value, second_Value);

        System.out.println("----------------------------------");
        System.out.println("The character with greater value is: " + greater_Value);
        System.out.println("----------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(first_Value + " : " + (int) first_Value);
        System.out.println(second_Value + " : " + (int) second_Value);
        
        scanner.close();
    }
}
