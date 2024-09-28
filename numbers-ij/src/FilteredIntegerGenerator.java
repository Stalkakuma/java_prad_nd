import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class FilteredIntegerGenerator implements IntegerGenerator {
    private NumberFilter filter;
    private IntegerGenerator generator;

    public FilteredIntegerGenerator(NumberFilter filter, IntegerGenerator generator) {
        this.filter = filter;
        this.generator = generator;
    }


    @Override
    public Integer getNext() {
        Integer next;
        while ((next = generator.getNext()) != null) {
            if (filter.accept(next)) {
                return next;
            }
        }
        return null;
    }
}
