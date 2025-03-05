import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero by cross multiplying
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three points
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        // Check collinearity using slope formula
        boolean collinearBySlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Slope Method: " + collinearBySlope);

        // Check collinearity using area formula
        boolean collinearByArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using Area Method: " + collinearByArea);

        // Final Result
        if (collinearBySlope && collinearByArea) {
            System.out.println("The three points are collinear.");
        } else {
            System.out.println("The three points are NOT collinear.");
        }

        sc.close();
    }
}
