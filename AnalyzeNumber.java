import java.util.Scanner;

public class AnalyzeNumber {

    // Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking positive and negative & even and odd
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive");
                if (isEven(num)) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else {
                System.out.println(num + " is Negative.");
            }
        }

        // Comparing first and last elements
        int comparisonResult = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last element: ");
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        sc.close();
    }
}

