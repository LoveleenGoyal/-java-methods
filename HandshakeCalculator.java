import java.util.Scanner;

public class HandshakeCalculator {
	
	// method to calculate maximum number of handshakes
	public static int calculateHandshakes(int n) {
		return (n * (n - 1)) / 2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter the number of students: ");
		int students = sc.nextInt();
		
		if (students < 2) {
			System.out.println("At least 2 students are required for a handshake");
		} else {
			int maxHandshakes = calculateHandshakes(students);
			System.out.println("The maximum number of possible handshakes among " + students + " student is: " + maxHandshakes);
		}
		sc.close();
	}
}