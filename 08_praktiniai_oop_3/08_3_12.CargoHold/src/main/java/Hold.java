import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        hold = new ArrayList<>();
    }

    public int holdWeight() {
        int holdWeightSum = 0;
        for (Suitcase suitcase : hold) {
            holdWeightSum += suitcase.totalWeight();
        }
        return holdWeightSum;
    }

    public String howManyOfSuitcase() {
        return hold.isEmpty() ? "no suitcases"
                : hold.size() == 1 ? hold.size() + " suitcase"
                : hold.size() + " suitcases";
    }

    public void addSuitcase(Suitcase suitcase) {
        if (holdWeight() + suitcase.totalWeight() <= maximumWeight) {
            hold.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return howManyOfSuitcase() + " (" + holdWeight() + " kg)";
    }
}
