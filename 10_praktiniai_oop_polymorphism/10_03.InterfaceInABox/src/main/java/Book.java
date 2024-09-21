public class Book implements Packable{
    private String author;
    private String bookName;
    private double bookWeight;


    public Book(String author, String bookName, double bookWeight) {
        this.author = author;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
    }

    @Override
    public double weight() {
        return bookWeight;
    }

    public String toString() {
        return author+": "+bookName;
    }
}
