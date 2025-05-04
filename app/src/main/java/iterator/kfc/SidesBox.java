package iterator.kfc;

import java.util.ArrayList;
import java.util.List;

public class SidesBox implements Box<Sides> {
    private List<Sides> sides = new ArrayList<>();

    public void addSide(Sides side) {
        sides.add(side);
    }

    @Override
    public Iterator<Sides> createIterator() {
        return new SidesIterator(sides);
    }
}
