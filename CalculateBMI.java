import java.util.Scanner;

public class CalculateBMI {
    
    // Method to calculate BMI and store it in the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  
            double heightInCm = data[i][1]; 
            double heightInMeters = heightInCm / 100;  
            
            // BMI formula: weight (kg) / (height (m) * height (m))
            data[i][2] = weight / (heightInMeters * heightInMeters);  
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];  // Retrieve BMI value from the array

            // Determine BMI category
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = 10;  
		// 2D array to store weight, height, BMI
        double[][] data = new double[persons][3];  

        // Taking user input for weight and height
        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            data[i][0] = sc.nextDouble();  

            System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
            data[i][1] = sc.nextDouble();  
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI status
        String[] bmiStatus = determineBMIStatus(data);

        // Display results
        System.out.println("\nDetails of all individuals:");
        
        for (int i = 0; i < persons; i++) {
            System.out.println((i + 1) + " Person\nWeight: " + data[i][0] + " Height: " + data[i][1] + " BMI: " + data[i][2] + " Status: " + bmiStatus[i]);
        }

        sc.close();
    }
}
