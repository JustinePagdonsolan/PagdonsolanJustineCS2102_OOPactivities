import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kindly enter the range of the multiplication table: ");
        int range = input.nextInt();

        int[][] results = new int[range][range];

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                results[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("The Multiplication Table output:");
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                System.out.printf("%4d", results[i][j]);
            }
            System.out.println();
        }

        input.close(); 
    }
}

