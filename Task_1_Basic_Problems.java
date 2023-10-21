package lab5_2D_Arrays;

import java.util.Arrays;

public class Task_1_Basic_Problems {
	// Task 1.1: Implement the following method for adding 2 matrices.
	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

	// Task 1.2: Implement the following method for subtracting 2 matrices.
	// subtract 2 matrices
	public static int[][] subtract(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}

	// Task 1.3: Implement the following method for multiplying 2 matrices.
	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {

		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b[i].length; j++) {

				result[i][j] = 0;

				for (int k = 0; k < a[i].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	// Task 1.4: Implement the following method for transposing a given matrix:
	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		int[][] result = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[j][i]=a[i][j];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] a = { { 7, 2 }, { 5, 3 } };
		int[][] b = { { 2, 1 }, { 3, 1 } };
		System.out.println(Arrays.deepToString(add(a, b)));
		System.out.println(Arrays.deepToString(subtract(a, b)));
		System.out.println(Arrays.deepToString(multiply(a, b)));
		System.out.println(Arrays.deepToString(transpose(a)));

	}

}
