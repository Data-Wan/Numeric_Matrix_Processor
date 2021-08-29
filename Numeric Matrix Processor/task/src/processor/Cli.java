package processor;

import java.util.Scanner;

public class Cli {

    public static double[][] getMatrix(int rowSize, int columnSize) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = new double[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    public static int[] getSizeOfMatrix() {
        Scanner scanner = new Scanner(System.in);

        var rowSize = scanner.nextInt();
        var columnSize = scanner.nextInt();

        return new int[] {rowSize, columnSize};

    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
