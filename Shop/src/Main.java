import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        Shop shop = new Shop();

        System.out.println("Welcome to the shop UI! Leave input empty on name to exit");
        while(true) {
            String productName;
            double productPrice;
            String productType;
            System.out.println("Enter product name: ");
            userInput = scanner.nextLine();
            if(userInput.isEmpty()) {
                break;
            }
            productName = userInput;
            System.out.println("Enter product price: ");
            productPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Product type - nothing for simple, d for drug, a for alcohol: ");
            productType = scanner.nextLine();
            shop.addProduct(createNewItem(productType, productName, productPrice));

        }
        shop.listItems();
    }

    public static Product createNewItem(String type, String name, double price) {
        if(type.equals("d")) {
            return new Drug(name, price);
        }
        if(type.equals("a")){
            return new Alcohol(name, price);
        }
        return new SimpleProduct(name, price);
    }
}
