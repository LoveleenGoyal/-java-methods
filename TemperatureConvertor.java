import java.util.Scanner;

public class TemperatureConvertor {
	
	// Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kgs) {
        double kilograms2pounds = 2.20462;
        return kgs * kilograms2pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter the temperature in farhenheit: ");
		double farhenheit = sc.nextDouble();
		System.out.print("Enter the temperature in celsius: ");
		double celsius = sc.nextDouble();
		System.out.print("Enter the weight in pounds: ");
		double pounds = sc.nextDouble();
		System.out.print("Enter the weight in kgs: ");
		double kgs = sc.nextDouble();
		System.out.print("Enter in gallons: ");
		double gallons = sc.nextDouble();
		System.out.print("Enter in liters: ");
		double liters = sc.nextDouble();
		
		// Printing the results
        System.out.println(farhenheit + " Fahrenheit to Celsius: " + convertFahrenheitToCelsius(farhenheit));
        System.out.println(celsius + " Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println(pounds + " Pounds to Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println(kgs + " Kilograms to Pounds: " + convertKilogramsToPounds(kgs));
        System.out.println(gallons + " Gallons to Liters: " + convertGallonsToLiters(gallons));
        System.out.println(liters + " Liters to Gallons: " + convertLitersToGallons(liters));
		
		sc.close();
	}
}