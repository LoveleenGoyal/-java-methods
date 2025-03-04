import java.util.Scanner;

public class InterestCalculator {
    
    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.println("\nThe Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
        sc.close();
    }
}
