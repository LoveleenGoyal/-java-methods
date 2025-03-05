import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // Second last element (excluding the number itself)
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int factor : findFactors(number)) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int number) {
        long product = 1;
        for (int factor : findFactors(number)) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cube of factors
    public static long productOfCubeOfFactors(int number) {
        long product = 1;
        for (int factor : findFactors(number)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        return sumOfFactors(number) - number == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundant(int number) {
        return sumOfFactors(number) - number > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficient(int number) {
        return sumOfFactors(number) - number < number;
    }

    // Method to calculate factorial
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        System.out.println("Number: " + number);
        System.out.println("Factors: " + Arrays.toString(findFactors(number)));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));
        System.out.println("Is Perfect: " + isPerfect(number));
        System.out.println("Is Abundant: " + isAbundant(number));
        System.out.println("Is Deficient: " + isDeficient(number));
        System.out.println("Is Strong: " + isStrong(number));
    }
}
