import java.util.Random;

public class RandomNumber {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); 
		}
		return numbers;
    }

    // Method to calculate average, minimum, and maximum value
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;  
        int[] numbers = generate4DigitRandomArray(size);

        // Display generated numbers
        System.out.println("Generated Random Numbers:");
        for (int i = 0; i < size ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Find and display Average, Min, and Max values
        double[] results = findAverageMinMax(numbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
