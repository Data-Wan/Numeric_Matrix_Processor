package processor;

import java.util.Arrays;

public class ConsolePrinter {

    public static void printMatrix(double[][] matrix) {
        var rowSize = matrix.length;
        var columnSize = matrix[0].length;

        final boolean haveDecimalPart = Arrays.stream(matrix)
                                              .anyMatch(x ->
                                                                Arrays.stream(x)
                                                                      .anyMatch(number ->
                                                                                        Math.floor(number) != number));

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                var output = matrix[i][j];
                if (haveDecimalPart) {
                    System.out.print(output);
                } else {
                    System.out.print((int) output);
                }
                if (j + 1 < columnSize) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
