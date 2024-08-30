import java.util.Scanner;

public class Tempconvert{
        public static void main(String[]args){
            Scanner givenTemp = new Scanner(System.in);
            System.out.print("Enter a Celsius value: ");
            
            int celsius = givenTemp.nextInt();

            int fahrenheit = (celsius * 9/5 + 32);
            System.out.print( celsius + " Celsius is" + fahrenheit + " Fahrenheit");
        }

}
