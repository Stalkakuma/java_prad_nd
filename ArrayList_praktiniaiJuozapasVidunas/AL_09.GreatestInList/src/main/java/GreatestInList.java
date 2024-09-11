
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // implement finding the greatest number in the list here
        int listGreatest = list.get(0);
        for (Integer listItem : list) {
            if (listItem > listGreatest) {
                listGreatest = listItem;
            }
        }
        System.out.println("The greatest number: "+listGreatest);

    }
}
