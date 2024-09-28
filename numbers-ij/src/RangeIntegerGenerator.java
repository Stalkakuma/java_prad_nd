import lt.itakademija.exam.IntegerGenerator;

public class RangeIntegerGenerator implements IntegerGenerator {
    private int current;
    private int end;


    public RangeIntegerGenerator(int start, int end) {
        this.current = start;
        this.end = end;
    }

    public boolean hasNext() {
        return current <= end;
    }


    @Override
    public Integer getNext() {
        if (hasNext()) {
            return current++;
        } else {
            return null;
        }

    }
}
