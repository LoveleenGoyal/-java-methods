import java.util.Random;

public class BonusCalculator {
    
    // Generate salaries and years of service randomly
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2]; 
        Random random = new Random();

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = random.nextInt(80000) + 10000; 
            employeeData[i][1] = random.nextInt(10) + 1; 
        }
        return employeeData;
    }

    // Calculate new salary and bonus
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; 

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            updatedData[i][0] = bonusAmount;
            updatedData[i][1] = newSalary;
        }
        return updatedData;
    }

    // Display Results in Table Format
    public static void displayResults(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Emp No.", "Old Salary", "Years of Service", "Bonus Amount", "New Salary");
        System.out.println();

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusAmount = updatedData[i][0];
            double newSalary = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;

            System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f\n", i + 1, oldSalary, yearsOfService, bonusAmount, newSalary);
        }

        System.out.println();
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f\n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        
        displayResults(employeeData, updatedData);
    }
}
