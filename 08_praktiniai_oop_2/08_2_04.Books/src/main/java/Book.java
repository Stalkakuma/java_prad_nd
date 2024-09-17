public class Book {


    private String title;
    private int pages;
    private String pubYear;

    public Book(String title, int pages, String pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + pubYear;
    }

    public String getTitle() {
        return title;
    }


    public int getPages() {
        return pages;
    }


    public String getPubYear() {
        return pubYear;
    }


}
