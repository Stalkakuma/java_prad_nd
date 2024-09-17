
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare; //PRINCE PRINCE PRINCE PRINCE
        price = pricePerSquare * squares;
    }

    public boolean largerThan(Apartment compared) {
        return squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        return compared.price >= price ? compared.price - price : price - compared.price;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return price > compared.price;
    }
}
