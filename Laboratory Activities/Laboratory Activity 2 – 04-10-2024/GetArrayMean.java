import java.util.Scanner;

public class GetArrayMean {

    
    public static double getArrayMean(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Kindly state the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print("Enter 1st element/value: ");
            } else if (i == 1) {
                System.out.print("Enter 2nd element/value: ");
            } else if (i == 2) {
                System.out.print("Enter 3rd element/value: ");
            } else {
                System.out.print("Enter " + (i + 1) + "th element/value: ");
            }
            numbers[i] = scanner.nextInt();
        }
        
        
        double mean = getArrayMean(numbers);
        System.out.printf("The mean of array is: %.2f\n", mean);
    }
}

