public class CD implements Packable{
    private String artist;
    private String cdName;
    private int pubYear;
    private double weight;

    public CD(String artist, String cdName, int pubYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.pubYear = pubYear;
        weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return artist+": "+cdName+" ("+pubYear+")";
    }
}
