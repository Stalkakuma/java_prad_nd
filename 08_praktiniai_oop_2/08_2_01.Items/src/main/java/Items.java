
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter names: ");
        while (true) {
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(name);
            items.add(item);
        }
        System.out.println(items);
    }
}
