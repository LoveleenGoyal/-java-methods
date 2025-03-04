import java.util.Scanner;

public class LeapYearChecker {
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("The Leap Year check is only valid for years from 1582 onwards.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year (1582 or later): ");
        int year = sc.nextInt();

        // Check and display result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        sc.close();
    }
}
