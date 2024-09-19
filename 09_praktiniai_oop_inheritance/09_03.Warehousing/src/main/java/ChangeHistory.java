import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> herstory;

    public ChangeHistory() {
        herstory = new ArrayList<Double>();
    }

    public void add(double status) {
        herstory.add(status);
    }

    public void clear() {
        herstory.clear();
    }

    public double maxValue() {
        return herstory.isEmpty() ? 0 : Collections.max(herstory);
    }

    public double minValue() {
        return herstory.isEmpty() ? 0 : Collections.min(herstory);
    }

    public double average() {
        double sum = 0;
        for (Double her : herstory) {
            sum += her;
        }
        return herstory.isEmpty() ? 0 : sum / herstory.size();
    }

    @Override
    public String toString() {
        return herstory.toString();
    }
}
