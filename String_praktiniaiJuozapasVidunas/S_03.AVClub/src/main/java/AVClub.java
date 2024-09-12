
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] whiteSpaced;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
        whiteSpaced = input.split(" ");
        for (String word : whiteSpaced) {
            if (word.contains("av")) {
                System.out.println(word);
            }
        }
        }
    }
}