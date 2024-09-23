import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> shop;


    public Shop() {
        shop = new ArrayList<>();
    }

    public void addProduct(Product product) {
        shop.add(product);
    }

    public void listItems() {
        for(Product shopItem : shop) {
            System.out.println(shopItem.getName()+": "+shopItem.finalPrice()+" Type: "+shopItem.getClass());
        }
    }
}
