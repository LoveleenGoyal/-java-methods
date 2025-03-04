import java.util.Scanner;

public class DivideChocolates {
	
	// Method to find remainder and quotient
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of chocolates: ");
        int number = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();

        // Handling division by zero
        if (children == 0) {
            System.err.println("Atleast 1 child should be there to get chocolates.");
			System.exit(0);
        } else {
            // Calling the method
            int[] result = findRemainderAndQuotient(number, children);

            // Displaying the results
            System.out.println("The number of chocolates each child will get is: " + result[0]);
            System.out.println("The number of remaining chocolates are: " + result[1]);
        }
        sc.close();
    }
}
