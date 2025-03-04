import java.util.Scanner;

public class WindChillCalculator {
	
	// Method to calculate the wind chill temperature 
	public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = sc.nextDouble();
		
		// Call the method 
		double windChill = calculateWindChill(temperature, windSpeed);
		// Display the results
		System.out.println("The wind chill temperature is: " + windChill + "°F");

        sc.close();
    }
}
