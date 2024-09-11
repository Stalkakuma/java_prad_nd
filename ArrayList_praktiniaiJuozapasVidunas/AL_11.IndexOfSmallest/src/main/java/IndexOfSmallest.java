
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println();
        int smallestNumber = list.get(0);
        for (Integer listItem : list) {
            if (listItem < smallestNumber) {
                smallestNumber = listItem;
            }
        }
        System.out.println("Smallest number: "+smallestNumber);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallestNumber) {
                System.out.println("Found at index: "+i);
            }
        }
    }
}
