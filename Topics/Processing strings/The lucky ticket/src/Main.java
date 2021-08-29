import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var tickerNumber = in.nextLine().trim();

        var firstHalf = tickerNumber.substring(0, tickerNumber.length() / 2).toCharArray();
        var secondHalf = tickerNumber.substring(tickerNumber.length() / 2).toCharArray();

        var sumOfFirstHalf = 0;
        for (char ch : firstHalf) {
            sumOfFirstHalf += Integer.parseInt(String.valueOf(ch));
        }

        var sumOfSecondHalf = 0;
        for (char ch : secondHalf) {
            sumOfSecondHalf += Integer.parseInt(String.valueOf(ch));
        }

        System.out.println(sumOfFirstHalf == sumOfSecondHalf ? "Lucky" : "Regular");
    }
}