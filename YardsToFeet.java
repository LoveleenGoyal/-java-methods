import java.util.Scanner;

public class YardsToFeet {

    // Define constants for conversion factors 
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
	private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Method to convert yards to feet
    public static double convertYards2Feet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Method to convert feet to yards
    public static double convertFeet2Yards(double feet) {
        return feet * FEET_TO_YARDS;
    }
	
	// Method to convert meters to inches
    public static double convertMeter2Inches(double meter) {
        return meter * METERS_TO_INCHES;
    }
	
    // Method to convert inches to meters
    public static double convertInches2Meters(double inch) {
        return inch * INCHES_TO_METERS;
    }

    // Method to convert inches to cm
    public static double convertInches2Cm(double inch) {
        return inch * INCHES_TO_CM;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter in Feet: ");
		double feet = sc.nextDouble();
		System.out.print("Enter in Yards: ");
		double yards = sc.nextDouble();
		System.out.print("Enter in Meters: ");
		double meter = sc.nextDouble();
		System.out.print("Enter in Inches: ");
		double inch = sc.nextDouble();
		
        // Printing conversions
        System.out.println(yards + " yards to feet: " + convertYards2Feet(yards));
        System.out.println(feet + " feet to yards: " + convertFeet2Yards(feet));
        System.out.println(meter + " meters to inches: " + convertMeter2Inches(meter));
        System.out.println(inch + " inches to meters: " + convertInches2Meters(inch));
		System.out.println(inch + " inches to cms: " + convertInches2Cm(inch));
		
		sc.close();
    }
}

