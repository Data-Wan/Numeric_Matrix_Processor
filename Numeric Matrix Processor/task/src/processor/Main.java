package processor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.printOptions();
            System.out.print("Your choice: ");
            var option = Cli.getUserChoice();
            switch (option) {
                case 1:
                    addMatrices();
                    break;
                case 2:
                    multiplyMatrixByConstant();
                    break;
                case 3:
                    multiplyMatrixByMatrix();
                    break;
                case 4:
                    transposeMatrix();
                    break;
                case 5:
                    calculateDeterminantMatrix();
                    break;
                case 6:
                    inverseMatrix();
                    break;
                case 0:
                    return;
            }
        }
    }

    private static void inverseMatrix() {
        double[][] matrix = getMatrix();

        final double[][] result = MatrixUtils.inverseMatrix(matrix);
        System.out.println("The result is:");

        ConsolePrinter.printMatrix(result);
    }

    private static void calculateDeterminantMatrix() {
        double[][] matrix = getMatrix();
        final double result = MatrixCalculator.calculateDeterminantMatrix(matrix);
        System.out.println("The result is:");

        if (Math.floor(result) == result) {
            System.out.println((long) result);
        } else {
            System.out.println(result);
        }
    }

    private static void transposeMatrix() {
        Menu.printTransposeOptions();
        System.out.print("Your choice: ");
        var option = Cli.getUserChoice();
        switch (option) {
            case 1:
                transposeByMainDiagonal();
                break;
            case 2:
                transposeBySideDiagonal();
                break;
            case 3:
                transposeByVerticalLine();
                break;
            case 4:
                transposeByHorizontalLine();
                break;
        }
    }

    private static void transposeByVerticalLine() {
        double[][] matrix = getMatrix();
        final double[][] result = MatrixTranspose.transposeByVerticalLine(matrix);
        System.out.println("The result is:");

        ConsolePrinter.printMatrix(result);
    }

    private static void transposeByHorizontalLine() {
        double[][] matrix = getMatrix();
        final double[][] result = MatrixTranspose.transposeByHorizontalLine(matrix);
        System.out.println("The result is:");

        ConsolePrinter.printMatrix(result);
    }

    private static void transposeByMainDiagonal() {
        double[][] matrix = getMatrix();
        final double[][] result = MatrixTranspose.transposeByMainDiagonal(matrix);
        System.out.println("The result is:");

        ConsolePrinter.printMatrix(result);
    }

    private static void transposeBySideDiagonal() {
        double[][] matrix = getMatrix();
        final double[][] result = MatrixTranspose.transposeBySideDiagonal(matrix);
        System.out.println("The result is:");

        ConsolePrinter.printMatrix(result);
    }

    private static void multiplyMatrixByMatrix() {
        double[][] firstMatrix = getFirstMatrix();

        double[][] secondMatrix = getSecondMatrix();

        if (firstMatrix[0].length != secondMatrix.length) {
            System.out.println("The operation cannot be performed.");
            return;
        }

        System.out.println("The result is:");

        double[][] result = MatrixCalculator.multiplyMatrixByMatrix(firstMatrix, secondMatrix);

        ConsolePrinter.printMatrix(result);
    }

    private static void multiplyMatrixByConstant() {
        double[][] matrix = getMatrix();
        double constant = getConstant();

        final double[][] result = MatrixCalculator.multiplyMatrixByConstant(matrix, constant);
        System.out.println("The result is:");

        ConsolePrinter.printMatrix(result);
    }

    private static double getConstant() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter constant: ");
        return scanner.nextDouble();
    }

    private static void addMatrices() {
        double[][] firstMatrix = getFirstMatrix();

        double[][] secondMatrix = getSecondMatrix();

        System.out.println("The result is:");

        double[][] result = MatrixCalculator.sumMatrix(firstMatrix, secondMatrix);

        ConsolePrinter.printMatrix(result);
    }

    private static double[][] getSecondMatrix() {
        System.out.println("Enter size of second matrix: ");

        final int[] sizeOfMatrix2 = Cli.getSizeOfMatrix();
        var rowSize2 = sizeOfMatrix2[0];
        var colSize2 = sizeOfMatrix2[1];
        System.out.println("Enter second matrix:");
        return Cli.getMatrix(rowSize2, colSize2);
    }

    private static double[][] getFirstMatrix() {
        System.out.println("Enter size of first matrix: ");

        final int[] sizeOfMatrix1 = Cli.getSizeOfMatrix();
        var rowSize1 = sizeOfMatrix1[0];
        var colSize1 = sizeOfMatrix1[1];

        System.out.println("Enter first matrix:");
        return Cli.getMatrix(rowSize1, colSize1);
    }

    private static double[][] getMatrix() {
        System.out.print("Enter size of matrix: ");

        final int[] sizeOfMatrix1 = Cli.getSizeOfMatrix();
        var rowSize1 = sizeOfMatrix1[0];
        var colSize1 = sizeOfMatrix1[1];

        System.out.println("Enter matrix:");
        return Cli.getMatrix(rowSize1, colSize1);
    }
}
