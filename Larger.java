import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Using a method to find the larger number
        int larger = findLargerNumber(num1, num2);

        // Display the result
        System.out.println("The larger number is: " + larger);

        // Additional demonstration using if-else
        if (num1 > num2) {
            System.out.println("Using if-else: The larger number is " + num1);
        } else if (num1 < num2) {
            System.out.println("Using if-else: The larger number is " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }

    // Method to find the larger of two numbers
    public static int findLargerNumber(int a, int b) {
        return (a > b) ? a : b;
    }
}
