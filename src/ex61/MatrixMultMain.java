package ex61;

import java.util.Arrays;

public class MatrixMultMain {
	static int[][] A = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
	static int[][] B = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static void main(String[] args) {

		int[][] result = matrixProductThreads(A, B);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] matrixProductThreads(int[][] a, int[][] b) {
		int[][] bTransp = transpose(b);
		if (A[0].length != B[0].length)
			return new int[0][0];
		int[][] result = new int[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < bTransp.length; j++) {
				DotProductThread t = new DotProductThread(A[i], bTransp[j]);
				/*
				 * The start() method is the correct way to initiate a new thread in Java. When
				 * you call start(), it creates a new thread of execution and invokes the run()
				 * method in that new thread. This allows the run() method to execute
				 * concurrently with the main thread and any other threads that may be running.
				 * Using start() is essential for achieving true multithreading.
				 * 
				 * Calling the run() method directly does not start a new thread; instead, it
				 * executes the run() method in the thread that called it. This means that if
				 * you call run() directly, the code inside run() will execute sequentially,
				 * blocking the current thread until it completes.
				 * 
				 * Matrix product computation is a good application for multithreading.
				 * 
				 * The computation of matrix products involves independent calculations for each
				 * element in the resulting matrix. For example, to compute the element at
				 * position (i, j) in the resulting matrix, you only need the corresponding row
				 * from the first matrix and the column from the second matrix. This
				 * independence allows for parallel execution.
				 * 
				 * By using multiple threads, you can distribute the workload across multiple
				 * CPU cores, significantly reducing the overall computation time. 
				 */
				// t.run();
				t.start();
				try {
					t.join(); // Wait for the thread to finish
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				result[i][j] = t.getDot();
			}
		}
		return result;
	}

	public static int[][] transpose(int[][] a) {
		int zeile = a.length;
		int spalte = a[0].length;
		int[][] transp = new int[spalte][zeile];
		for (int i = 0; i < zeile; i++) {
			for (int j = 0; j < spalte; j++) {
				transp[j][i] = a[i][j];
			}
		}
		return transp;
	}
}
