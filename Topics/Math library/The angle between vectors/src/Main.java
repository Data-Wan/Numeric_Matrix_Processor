import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double dotProduct = x1 * x2 + y1 * y2;
        double firstMagnitude = (Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)));
        double secondMagnitude = (Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)));
        double cos = dotProduct / (firstMagnitude * secondMagnitude);

        double angleRadian = Math.acos(cos);

        var result = Math.toDegrees(angleRadian);
        System.out.println(result);
    }
}