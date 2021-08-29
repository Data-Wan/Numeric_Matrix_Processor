import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var sizeOfArray = scanner.nextInt();

        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();

        var index1 = -100;
        var index2 = -200;
        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i] == number1) {
                index1 = i;
            } else if (array[i] == number2) {
                index2 = i;
            }
        }

        System.out.println(Math.abs(index1 - index2) == 1);
    }
}