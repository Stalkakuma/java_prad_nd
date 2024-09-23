import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcase = new ArrayList<>();
    }

    public int totalWeight() {
        int weightSum = 0;
        for (Item suitcaseItem : suitcase) {
            weightSum += suitcaseItem.getWeight();
        }
        return weightSum;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            suitcase.add(item);
        }
    }

    public void printItems() {
        for(Item suitcaseItem : suitcase) {
            System.out.println(suitcaseItem.toString());
        }
    }

    public Item heaviestItem() {
        if(suitcase.isEmpty()) {
            return null;
        }
        Item heaviest = suitcase.get(0);
        for(Item suitcaseItem : suitcase) {
            if(suitcaseItem.getWeight() > heaviest.getWeight()) {
                heaviest = suitcaseItem;
            }
        }
        return heaviest;
    }

    public String howManyOfItem() {
        return suitcase.isEmpty() ? "no items"
                : suitcase.size() == 1 ? suitcase.size() + " item"
                : suitcase.size() + " items";
    }

    @Override
    public String toString() {
        return howManyOfItem() + " (" + totalWeight() + " kg)";
    }

}
