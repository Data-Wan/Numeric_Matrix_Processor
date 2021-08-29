import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();

        double p = (a + b + c) / 2;

        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(result);
    }
}