import java.util.Scanner;

public class QuotientAndRemainder {
	
	// Method to find remainder and quotient
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the dividend: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Handling division by zero
        if (divisor == 0) {
            System.err.println("Error! Division by zero is not allowed.");
			System.exit(0);
        } else {
            // Calling the method
            int[] result = findRemainderAndQuotient(number, divisor);

            // Displaying the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
        sc.close();
    }
}
