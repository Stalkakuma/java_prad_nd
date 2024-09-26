import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PhilatelistBaseTest;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PhilatestlistTest extends PhilatelistBaseTest {

    @Override
    protected Philatelist getPhilatelist() {
        return new Philatelist() {
            ArrayList<PostStamp> stamps = new ArrayList<>();

            @Override
            public void addToCollection(PostStamp postStamp) {
                if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty())
                    throw new IllegalArgumentException();
                stamps.add(postStamp);
            }

            @Override
            public int getNumberOfPostStampsInCollection() {
                return stamps.size();
            }

            @Override
            public void printAllPostStampNames() {
                stamps.forEach(stamp -> System.out.println(stamp.getName()));
            }

            @Override
            public void printPostStampsWithPriceGreaterThan(double v) {
                stamps.stream()
                        .filter(stamp -> stamp.getMarketPrice() > v)
                        .forEach(stamp -> System.out.println(stamp.getName()));
            }

            @Override
            public boolean isPostStampInCollection(PostStamp postStamp) {
                return stamps.contains(postStamp);
            }

            @Override
            public boolean isPostStampWithNameInCollection(String s) {
                for (PostStamp stamp : stamps) {
                    if (stamp.getName().equals(s)) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public double calculateTotalMarketPrice() {
                return stamps.stream()
                        .mapToDouble(PostStamp::getMarketPrice)
                        .sum();
            }

            @Override
            public double getAveragePostStampPrice() {
                return calculateTotalMarketPrice()/stamps.size();
            }

            @Override
            public PostStamp getTheMostExpensivePostStampByMarketValue() {
                return stamps.stream()
                        .max(Comparator.comparing(PostStamp::getMarketPrice))
                        .orElseThrow();
            }

            @Override
            public List<PostStamp> findPostStampsByNameContaining(String s) {
                return stamps.stream()
                        .filter(stamp -> stamp.getName().contains(s))
                        .toList();
            }

            @Override
            public List<PostStamp> getSortedPostStampsByName() {
                return stamps.stream()
                        .sorted(Comparator.comparing(PostStamp::getName))
                        .toList();
            }
        };
    }
}
