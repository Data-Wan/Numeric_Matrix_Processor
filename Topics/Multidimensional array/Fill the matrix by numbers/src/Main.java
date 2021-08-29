import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(Math.abs(i - j));

                if (j + 1 < size) {
                    System.out.print(" ");
                }
            }
            if (i + 1 < size) {
                System.out.println();
            }
        }
    }
}