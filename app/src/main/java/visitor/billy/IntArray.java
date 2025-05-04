package visitor.billy;

import java.util.ArrayList;
import java.util.List;

// Concrete Element class which is getting visited
public class IntArray implements DataVisitable {
    private List<Integer> array = new ArrayList<>();

    public void add(int x) {
        array.add(x);
    }

    public int get(int index) {
        return array.get(index);
    }

    public List<Integer> listAll() {
        return new ArrayList<Integer>(array);
    }

    @Override
    public void accept(DataVisitor visitor) {
        visitor.visit(this);
    }
}

