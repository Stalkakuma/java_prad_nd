import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double boxCapacity;

    public Box(double boxCapacity) {
        this.items = new ArrayList<>();
        this.boxCapacity = boxCapacity;
    }

    public double weight() {
        double itemsWeight = 0;
        for (Packable item : items) {
            itemsWeight += item.weight();
        }
        return itemsWeight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= boxCapacity) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}