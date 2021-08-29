import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var count = 0;
        while (scanner.hasNext()) {

            if (scanner.nextInt() == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}