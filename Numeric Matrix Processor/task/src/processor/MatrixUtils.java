package processor;

public class MatrixUtils {

    public static double[][] inverseMatrix(final double[][] matrix) {
        var determinant = MatrixCalculator.calculateDeterminantMatrix(matrix);

        var allyMatrix = getAllyMatrix(matrix);
        var result = MatrixCalculator.multiplyMatrixByConstant(allyMatrix, 1 / determinant);

        return result;
    }

    public static double[][] getAllyMatrix(final double[][] matrix) {
        var transposedMatrix = MatrixTranspose.transposeMatrix(matrix);

        var result = new double[transposedMatrix.length][transposedMatrix[0].length];
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                var index1 = i + 1;
                var index2 = j + 1;
                result[i][j] = Math.pow(-1, index1 + index2) *
                               MatrixCalculator.calculateDeterminantMatrix(MatrixCalculator.getMinor(transposedMatrix,
                                                                                                     i,
                                                                                                     j));
            }
        }
        return result;
    }
}
