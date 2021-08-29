import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var string = scanner.nextLine().trim();

        if (string.length() < 2) {
            System.out.println(true);
            return;
        }

        final char[] chars = string.toCharArray();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] - chars[i-1] != 1) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}