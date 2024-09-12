
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int current = Integer.parseInt(input.substring(input.indexOf(",") + 1));
            if (current > greatest) {
                greatest = current;
            }
            System.out.println("Age of the oldest: " + greatest);
        }
    }
}
