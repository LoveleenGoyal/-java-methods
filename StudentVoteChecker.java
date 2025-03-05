import java.util.Scanner;

public class StudentVoteChecker {
	
	// Method to check if student can vote or not
	public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; 
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Initialize array to store age of 10 students
		int[] ages = new int[10];
		
		StudentVoteChecker check = new StudentVoteChecker();
		
		// Get the user input for student age
		for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
		
		for (int i = 0; i < 10; i++) {
			// Check if the student can vote
            if (check.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
		}

        sc.close();
    }
}