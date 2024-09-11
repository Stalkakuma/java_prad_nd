
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String searchValue = scanner.nextLine();
        boolean isFound = false;
        for (String listItem : list) {
            if (listItem.equals(searchValue)) {
                isFound = true;
                break;
            }
        }
        System.out.println((isFound ? searchValue + " was found!" : searchValue + " was not found!"));
    }
}
