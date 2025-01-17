import java.util.Scanner;

public class Smaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the smallest number
        int smallest = (num1 < num2) ? num1 : num2;

        // Display the result
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
