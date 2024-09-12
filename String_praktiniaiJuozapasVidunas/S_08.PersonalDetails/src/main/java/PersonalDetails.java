
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int current = Integer.parseInt(input.substring(input.indexOf(",") + 1));
            sum += current;
            count++;
            String currentName = input.substring(0, input.indexOf(","));
            if (currentName.length() > longestName.length()) {
                longestName = currentName;
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / count);

    }
}
