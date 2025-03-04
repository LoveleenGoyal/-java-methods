import java.util.Scanner;

public class TrigonometricCalculator {
	
    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
		double tanValue = Math.tan(radians);

        return new double[]{sinValue, cosValue, tanValue};
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the angle
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigonometric values
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sin(" + angle + ") = " + String.format("%.2f", results[0]));
		System.out.println("Cos(" + angle + ") = " + String.format("%.2f", results[1]));
		System.out.println("Tan(" + angle + ") = " + String.format("%.2f", results[2]));

        
        sc.close();
    }
}
