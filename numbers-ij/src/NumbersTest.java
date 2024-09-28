import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;
import lt.itakademija.exam.test.BaseTest;

import java.util.*;
import java.util.stream.IntStream;

public class NumbersTest extends BaseTest {


    @Override
    protected Exercises createExercises() {
        return new Exercises() {
            @Override
            public Integer findSmallest(List<Integer> list) {
                return list.stream()
                        .min(Integer::compare)
                        .get();
            }

            @Override
            public Integer findLargest(List<Integer> list) {
                return list.stream()
                        .max(Integer::compare)
                        .get();
            }

            @Override
            public boolean isEqual(Object o, Object o1) {
                return o.equals(o1);
            }

            @Override
            public boolean isSameObject(Object o, Object o1) {
                return o == o1;
            }

            @Override
            public List<Integer> consume(Iterator<Integer> iterator) {
                List<Integer> list = new ArrayList<>();
                while (iterator.hasNext()) {
                    list.add(iterator.next());
                }
                return list;
            }

            @Override
            public int computeSumOfNumbers(int i) {
                int sum = 0;
                for (int k = 1; k <= i; k++) {
                    sum += k;
                }
                return sum;
            }

            @Override
            public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
                int sum = 0;
                for (int k = 1; k <= i; k++) {
                    if (numberFilter.accept(k)) {
                        sum += k;
                    }
                }
                return sum;
            }

            @Override
            public List<Integer> computeNumbersUpTo(int i) {
                List<Integer> list = new ArrayList<>();
                int number = 1;
                while (number < i) {
                    list.add(number);
                    number++;
                }
                return list;
            }

            @Override
            public Map<Integer, Integer> countOccurrences(List<Integer> list) {
                Map<Integer, Integer> map = new HashMap<>();
                for (Integer integer : list) {
                    int count = (int) list.stream().filter(n -> n.equals(integer)).count();
                    map.put(integer, count);
                }
                return map;
            }

            @Override
            public IntegerGenerator createIntegerGenerator(int i, int i1) {
                return new RangeIntegerGenerator(i, i1);
            }

            @Override
            public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
                return new FilteredIntegerGenerator(numberFilter, integerGenerator);
            }
        };
    }

}
