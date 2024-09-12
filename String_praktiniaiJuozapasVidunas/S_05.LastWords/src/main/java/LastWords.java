
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] whiteSpaced;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            whiteSpaced = input.split(" ");
            System.out.println(whiteSpaced[whiteSpaced.length - 1]);
        }

    }
}
