import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate Euclidean distance between two points
    public static double findEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the slope and y-intercept of the line
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1); 
        double b = y1 - m * x1;
        return new double[]{m, b}; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two points
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        // Calculate Euclidean Distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        // Calculate Line Equation
        if (x1 != x2) { 
            double[] equation = findLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.1fx + %.1f\n", equation[0], equation[1]);
        } else {
            System.out.println("The line is vertical, equation: x = " + x1);
        }

        scanner.close();
    }
}
