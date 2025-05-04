package iterator.kfc;

import java.util.ArrayList;
import java.util.List;

public class ChickenBox implements Box<Chicken> {
    private List<Chicken> chickens = new ArrayList<>();

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }

    @Override
    public Iterator<Chicken> createIterator() {
        return new ChickenIterator(chickens);
    }

}
