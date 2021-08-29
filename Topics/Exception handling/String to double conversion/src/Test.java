import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        File file = new File("/home/vitaliy/Downloads/dataset_91033.txt");

        try (Scanner scanner = new Scanner(file)) {
            var sum = 0;
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
