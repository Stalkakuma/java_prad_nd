
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        String oldestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int current = Integer.parseInt(input.substring(input.indexOf(",") + 1));
            if (current > greatest) {
                greatest = current;
                oldestName = input.substring(0, input.indexOf(","));
            }
            System.out.println("Name of the oldest: " + oldestName);
        }

    }
}
