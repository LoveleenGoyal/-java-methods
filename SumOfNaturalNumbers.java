import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    // Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to find the sum using formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("Please enter a valid natural number (greater than 0).");
            System.exit(0);
        }

        // Compute sum using recursion and formula
        int sumByRecursion = sumRecursive(n);
        int sumByFormula = sumFormula(n);

        // Display results
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumByRecursion);
        System.out.println("Sum of first " + n + " natural numbers using formula: " + sumByFormula);

        // Verify both results are the same
        if (sumByRecursion == sumByFormula) {
            System.out.println("Both results match");
        } else {
            System.out.println("Mismatch in results");
        }
        sc.close();
    }
}
