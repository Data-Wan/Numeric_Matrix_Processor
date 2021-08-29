import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        String word = String.valueOf(ch);
        int vowelsCount = word.replaceAll("[^aeiouAEIOU]", "").length();

        return vowelsCount > 0;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}