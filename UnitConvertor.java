import java.util.Scanner;

public class UnitConvertor {

    // Define constants for conversion factors 
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter in KMs: ");
		double km = sc.nextDouble();
		System.out.print("Enter in miles: ");
		double miles = sc.nextDouble();
		System.out.print("Enter in meters: ");
		double meters = sc.nextDouble();
		System.out.print("Enter in feet: ");
		double feet = sc.nextDouble();
		
        // Printing conversions
        System.out.println(km + " km to miles: " + convertKmToMiles(km));
        System.out.println(miles + " miles to km: " + convertMilesToKm(miles));
        System.out.println(meters + " meters to feet: " + convertMetersToFeet(meters));
        System.out.println(feet + " feet to meters: " + convertFeetToMeters(feet));
    }
}
