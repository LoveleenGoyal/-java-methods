import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to generate a random matrix with given rows and columns
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%8d", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static int[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }
        int[][] inverse = {
            { matrix[1][1] / det, -matrix[0][1] / det },
            { -matrix[1][0] / det, matrix[0][0] / det }
        };
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static int[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }
        int[][] inverse = new int[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
        inverse[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]) / det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
        inverse[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) / det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
        inverse[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]) / det;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
        inverse[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]) / det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;
        return inverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows for matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = sc.nextInt();

        int[][] matrixA = generateRandomMatrix(rows, cols);
        int[][] matrixB = generateRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Addition of matrices:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Subtraction of matrices:");
        displayMatrix(subtractMatrices(matrixA, matrixB));
		
		if (cols == rows) {
			System.out.println("Multiplication of matrices:");
			displayMatrix(multiplyMatrices(matrixA, matrixB));
		} else {
			System.out.print("Multiplication not valid.");
		}

        if (rows == cols) {
            System.out.println("Transpose of Matrix A:");
            displayMatrix(transposeMatrix(matrixA));
			System.out.println("Transpose of Matrix B:");
            displayMatrix(transposeMatrix(matrixB));

            if (rows == 2) {
                System.out.println("Determinant of Matrix A: " + determinant2x2(matrixA));
				System.out.println("Determinant of Matrix B: " + determinant2x2(matrixB));
                System.out.println("Inverse of Matrix A:");
                displayMatrix(inverse2x2(matrixA));
				System.out.println("Inverse of Matrix B:");
                displayMatrix(inverse2x2(matrixB));
            } else if (rows == 3) {
                System.out.println("Determinant of Matrix A: " + determinant3x3(matrixA));
				System.out.println("Determinant of Matrix B: " + determinant3x3(matrixB));
                System.out.println("Inverse of Matrix A:");
				displayMatrix(inverse3x3(matrixA));
				System.out.println("Inverse of Matrix B:");
				displayMatrix(inverse3x3(matrixB));
            } else {
				System.out.println("Determinant & Inverse calculations only for 2x2 or 3x3 matrices.");
			}
        }

        sc.close();
    }
}