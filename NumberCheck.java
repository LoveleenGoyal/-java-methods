import java.util.Scanner;

public class NumberCheck {
    
    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;  
        } else if (num < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call method and get result
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        sc.close();
    }
}
