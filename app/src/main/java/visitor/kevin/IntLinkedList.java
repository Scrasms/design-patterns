package visitor.kevin;

import java.util.LinkedList;
import java.util.List;

// Concrete Element class which is getting visited
public class IntLinkedList implements DataVisitable {
    private List<Integer> list = new LinkedList<>();

    public void add(int x) {
        list.add(x);
    }

    public int get(int index) {
        return list.get(index);
    }

    public List<Integer> listAll() {
        return new LinkedList<Integer>(list);
    }

    @Override
    public void accept(DataVisitor visitor) {
        visitor.visit(this);
    }
}
