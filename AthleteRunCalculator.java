import java.util.Scanner;

public class AthleteRunCalculator {
    
    // Method to calculate the number of rounds required
    public static int calculateRounds(double side1, double side2, double side3) {
		// Calculate perimeter of the triangular park
        double perimeter = side1 + side2 + side3; 
		// Calculate required rounds (rounding up)
        return (int) Math.ceil(5000 / perimeter); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the three sides of the triangle
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Check if the sides form a valid triangle
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            System.out.println("Invalid triangle!");
        } else {
            int rounds = calculateRounds(side1, side2, side3);
            System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run");
        }
        sc.close();
    }
}
