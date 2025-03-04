import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true; 
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Check month and day input is valid
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month and day");
        } else {
            // Display results
            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }
        sc.close();
    }
}
