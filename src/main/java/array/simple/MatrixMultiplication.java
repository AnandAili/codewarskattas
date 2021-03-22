package array.simple;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] matrixA = {{1,2},{1,2}};
        int[][] matrixB = {{1,2},{1,2}};
        int[][] resultMatrix = matrix.multiply(matrixA, matrixB);
        for (int[] a : resultMatrix
        ) {
            System.out.println(Arrays.toString(a));
        }
    }
}

class Matrix {

    public int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int[][] resultMatrix = new int[matrixA.length][matrixB.length];

        // TODO: matrix A for loop
        for (int i = 0; i < matrixA.length; i++) {
            // TODO: matrix B for loop
            for (int j = 0; j < matrixB.length; j++) {
                for(int k = 0 ; k < matrixA.length; k++) {
                    // TODO: matrix multiplication a[i][k] * b[k][j]
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;

    }
}
