import java.util.Scanner;

public class Quadratic {
    
    // Method to calculate the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
		// Compute the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;  
        
        // If delta is negative, no real roots
        if (delta < 0) {
            return new double[0]; 
        }
        
        // If delta is zero, one real root exists
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; 
        }
        
        // If delta is positive, two real roots exist
        double sqrtDelta = Math.sqrt(delta); 
        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);
        return new double[]{root1, root2}; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Check if it's a quadratic equation 
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero).");
        } else {
            double[] roots = findRoots(a, b, c);

            // Display results based on the number of roots found
            if (roots.length == 0) {
                System.out.println("No real roots");
            } else if (roots.length == 1) {
                System.out.println("One real root: x = " + roots[0]);
            } else {
                System.out.println("Two real roots: x1 = " + roots[0] + ", x2 = " + roots[1]);
            }
        }
        sc.close();
    }
}
