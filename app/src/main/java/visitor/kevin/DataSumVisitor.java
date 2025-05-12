package visitor.kevin;

// Concrete Visitor class implementing different visiting behaviour
public class DataSumVisitor implements DataVisitor {
    private int sum;

    @Override
    public void visit(IntArray element) {
        sum = element.listAll().stream()
                .reduce(0, (x, y) -> x + y);
    }

    @Override
    public void visit(IntLinkedList element) {
        sum = element.listAll().stream()
                .reduce(0, (x, y) -> x + y);
    }

    @Override
    public void visit(IntMap element) {
        sum = element.mapAll().values().stream()
                .reduce(0, (x, y) -> x + y);
    }

    public int getSum() {
        return sum;
    }
}
