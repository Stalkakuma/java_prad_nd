
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] whiteSpaced;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            whiteSpaced = input.split(" ");
            System.out.println(whiteSpaced[0]);
        }
    }
}
