import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String DIGITS = "0123456789";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var A = scanner.nextInt();
        var B = scanner.nextInt();
        var C = scanner.nextInt();
        var N = scanner.nextInt();

        List<String> password = new ArrayList<>();
        List<String> lower = new ArrayList<>(Arrays.asList(LOWER.split("")));
        List<String> upper = new ArrayList<>(Arrays.asList(UPPER.split("")));
        List<String> digits = new ArrayList<>( Arrays.asList(DIGITS.split("")));


        Random random = new Random();

        for (int j = 0; j < A; j++) {
            Optional<String> e = upper.stream()
                            .filter( x -> password.size() < 1 || !x.equals(password.get(password.size() - 1)))
                             .findAny();

            password.add(e.get());
        }

        for (int i = 0; i < B; i++) {
            Optional<String> e = lower.stream()
                            .filter( x -> password.size() < 1 || !x.equals(password.get(password.size() - 1)))
                            .findAny();


            password.add(e.get());
        }

        for (int i = 0; i < C; i++) {

            Optional<String> e = digits.stream()
                            .filter( x -> password.size() < 1 || !x.equals(password.get(password.size() - 1)))
                            .findAny();


            password.add(e.get());
        }

        var allChars = new ArrayList<String>();

        allChars.addAll(digits);
        allChars.addAll(upper);
        allChars.addAll(lower);

        while(password.size() < N) {
            Optional<String> e = allChars.stream()
                               .filter( x -> password.size() < 1 || !x.equals(password.get(password.size() - 1)))
                               .findAny();

            password.add(e.get());
        }

        String result = password.stream()
                             .map(String::valueOf)
                             .collect(Collectors.joining());

        System.out.println(result);
    }
}