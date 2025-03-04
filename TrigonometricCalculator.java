import java.util.Scanner;

public class TrigonometricCalculator {
	
    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);

        // If cos is nearly zero, make it exactly zero
        if (Math.abs(cosValue) < 1e-10) { 
            cosValue = 0.0;
        }

        double tanValue;
        if (cosValue == 0) { // If cos is zero, tan is undefined (Infinity)
            tanValue = Double.POSITIVE_INFINITY;
        } else {
            tanValue = Math.tan(radians);
        }

        return new double[]{sinValue, cosValue, tanValue};
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the angle
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigonometric values
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine of " + angle + ": " + trigValues[0]);
        System.out.println("Cosine of " + angle + ": " + trigValues[1]);
        
        if (trigValues[2] == Double.POSITIVE_INFINITY) {
            System.out.println("Tangent of " + angle + ": Undefined");
        } else {
            System.out.println("Tangent of " + angle + ": " + trigValues[2]);
        }
        sc.close();
    }
}
