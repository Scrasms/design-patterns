package visitor;

import java.util.HashMap;
import java.util.Map;

// Concrete Element class which is getting visited
public class IntMap implements DataVisitable {
    private Map<Integer, Integer> map = new HashMap<>();

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int index) {
        return map.get(index);
    }

    public Map<Integer, Integer> mapAll() {
        return new HashMap<Integer, Integer>(map);
    }

    @Override
    public void accept(DataVisitor visitor) {
        visitor.visit(this);
    }
}
