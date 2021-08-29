package processor;

import processor.exception.SizeDontMatchException;

public class MatrixCalculator {

    public static double[][] sumMatrix(double[][] matrix1, double[][] matrix2) {

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new SizeDontMatchException();
        }

        final int rowSize = matrix1.length;
        final int columnSize = matrix1[0].length;
        double[][] result = new double[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static double[][] multiplyMatrixByConstant(double[][] matrix, double multiplier) {
        final int rowSize = matrix.length;
        final int columnSize = matrix[0].length;
        double[][] result = new double[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                result[i][j] = matrix[i][j] * multiplier;
            }
        }
        return result;
    }

    public static double[][] multiplyMatrixByMatrix(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new SizeDontMatchException();
        }

        final int rowSize = matrix1.length;
        final int columnSize = matrix2[0].length;
        double[][] resultMatrix = new double[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                resultMatrix[i][j] = multiplyVectors(matrix1, matrix2, i, j);
            }
        }
        return resultMatrix;
    }

    private static double multiplyVectors(double[][] matrix1, double[][] matrix2, int index1, int index2) {
        double result = 0;
        for (int i = 0; i < matrix2.length; i++) {
            result += matrix1[index1][i] * matrix2[i][index2];
        }

        return result;
    }

    public static double calculateDeterminantMatrix(final double[][] matrix) {
        final int rowSize = matrix.length;
        final int columnSize = matrix[0].length;

        if (rowSize == 1 && columnSize == 1) {
            return matrix[0][0];
        }

        if (rowSize == 2 && columnSize == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double result = 0;
        for (int i = 0; i < rowSize; i += rowSize) {
            for (int j = 0; j < columnSize; j++) {
                var index1 = i + 1;
                var index2 = j + 1;
                result += Math.pow(-1, index1 + index2) *
                          matrix[i][j] *
                          calculateDeterminantMatrix(getMinor(matrix, i, j));
            }
        }
        return result;
    }

    public static double[][] getMinor(final double[][] matrix, final int i, final int j) {
        double[][] result = new double[matrix.length - 1][matrix[0].length - 1];

        var index1 = 0;
        var index2 = 0;
        for (int k = 0; k < matrix.length; k++) {
            if (k == i) {
                continue;
            }
            for (int l = 0; l < matrix[0].length; l++) {
                if (l == j) {
                    continue;
                }
                result[index1][index2++] = matrix[k][l];
            }
            index1++;
            index2 = 0;
        }
        return result;
    }
}
