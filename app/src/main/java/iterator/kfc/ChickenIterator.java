package iterator.kfc;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChickenIterator implements Iterator<Chicken> {
    private List<Chicken> chickens;
    private int index;
    public ChickenIterator(List<Chicken> chickens) {
        this.chickens = chickens.stream()
            .sorted(
                Comparator.comparing(Chicken::getName)
                    .thenComparing(Chicken::getPopularity)
                    .thenComparing(Chicken::getPrice)
            )
            .collect(Collectors.toList());
        index = 0;
    }

    @Override
    public Chicken getNext() {
        return chickens.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < chickens.size();
    }
}
