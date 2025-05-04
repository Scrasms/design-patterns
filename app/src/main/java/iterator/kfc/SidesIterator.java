package iterator.kfc;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SidesIterator implements Iterator<Sides> {
    private List<Sides> sides;
    private int index;

    public SidesIterator(List<Sides> sides) {
        this.sides = sides.stream()
                        .sorted(Comparator.comparing(Sides::getPrice)
                                        .thenComparing(Sides::getPopularity))
                        .collect(Collectors.toList());
        index = 0;
    }

    @Override
    public Sides getNext() {
        return sides.get(index++);
    }
    @Override
    public boolean hasNext() {
        return index < sides.size();
    }

}
