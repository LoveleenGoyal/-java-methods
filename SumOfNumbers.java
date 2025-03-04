import java.util.Scanner;

public class SumOfNumbers {

    // Method to calculate the sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
		
		// Check number is valid or not
        if (n < 1) {
            System.out.println("Please enter a positive integer");
        } else {
            // Calculate sum and display result
            int result = sumOfNaturalNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }
        sc.close();
    }
}

