import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String title;
        int nrPages;
        String pubYear;
        String whatIsPrinted;
        while (true) {
            System.out.println("Title ");
            title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages");
            nrPages = Integer.parseInt(scan.nextLine());
            System.out.println("Publication year: ");
            pubYear = scan.nextLine();
            Book book = new Book(title, nrPages, pubYear);
            books.add(book);
        }
        System.out.println("What information will be printed? ");
        whatIsPrinted = scan.nextLine();
        for (Book book : books) {
            if (whatIsPrinted.equals("everything")) {
                System.out.println(book);
            }
            if (whatIsPrinted.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
