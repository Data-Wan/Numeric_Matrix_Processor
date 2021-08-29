package processor;

public class MatrixTranspose {

    public static double[][] transposeByMainDiagonal(double[][] matrix) {
        var rowSize = matrix.length;
        var colSize = matrix[0].length;

        var result = new double[rowSize][colSize];
        copyMatrix(matrix, result);

        final int diagonalSize = Math.min(rowSize, colSize);
        for (int i = 0; i < diagonalSize; i++) {
            for (int j = i + 1; j < diagonalSize; j++) {
                result[i][j] = matrix[j][i];
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    private static void copyMatrix(final double[][] source, final double[][] target) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                target[i][j] = source[i][j];
            }
        }
    }

    public static double[][] transposeBySideDiagonal(double[][] matrix) {
        var rowSize = matrix.length;
        var colSize = matrix[0].length;

        var result = new double[rowSize][colSize];
        copyMatrix(matrix, result);

        final int diagonalSize = Math.min(rowSize, colSize);
        for (int i = 0; i < (diagonalSize - 1); i++) {
            for (int j = 0; j < (diagonalSize - 1) - i; j++) {
                var tmp = matrix[i][j];
                result[i][j] = matrix[(diagonalSize - 1) - j][(diagonalSize - 1) - i];
                result[(diagonalSize - 1) - j][(diagonalSize - 1) - i] = tmp;
            }
        }
        return result;
    }

    public static double[][] transposeByVerticalLine(double[][] matrix) {

        var rowSize = matrix.length;
        var colSize = matrix[0].length;

        var result = new double[rowSize][colSize];
        copyMatrix(matrix, result);

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize / 2; j++) {
                result[i][j] = matrix[i][colSize - j - 1];
                result[i][colSize - j - 1] = matrix[i][j];
            }
        }
        return result;
    }

    public static double[][] transposeByHorizontalLine(double[][] matrix) {
        var rowSize = matrix.length;
        var colSize = matrix[0].length;

        var result = new double[rowSize][colSize];
        copyMatrix(matrix, result);

        for (int i = 0; i < rowSize / 2; i++) {
            for (int j = 0; j < colSize; j++) {
                result[i][j] = matrix[rowSize - i - 1][j];
                result[rowSize - i - 1][j] = matrix[i][j];
            }
        }
        return result;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        var rowSize = matrix[0].length;
        var colSize = matrix.length;

        var result = new double[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return  result;
    }
}
