package visitor;

// Concrete Visitor class implementing different visiting behaviour
public class DataPrintVisitor implements DataVisitor {
    @Override
    public void visit(IntArray element) {
        System.out.println(element.listAll());
    }

    @Override
    public void visit(IntLinkedList element) {
        System.out.println(element.listAll());
    }

    @Override
    public void visit(IntMap element) {
        System.out.println(element.mapAll());
    }
}
