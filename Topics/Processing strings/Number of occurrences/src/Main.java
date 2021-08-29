import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var string = scanner.nextLine();

        var subString= scanner.nextLine();
        var count = 0;
        for (int i = 0; i < string.length(); ) {
            if (string.startsWith(subString, i)) {
                count++;
                i+= subString.length();
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}