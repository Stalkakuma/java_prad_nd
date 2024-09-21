import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public boolean isCapacityEnough(Item item) {
        int weightSum = 0;
        for (Item itemWeight : items) {
            weightSum += itemWeight.getWeight();
        }
        return weightSum + item.getWeight() <= capacity;
    }

    @Override
    public void add(Item item) {
        if (isCapacityEnough(item)) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

}
