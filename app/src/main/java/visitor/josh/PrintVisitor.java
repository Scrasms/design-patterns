package visitor.josh;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(IntArray array) {
        System.out.println("Array: " + array.listAll());
    }

    @Override
    public void visit(IntLinkedList list) {
        System.out.println("LinkedList: " + list.listAll());
    }

    @Override
    public void visit(IntMap map) {
        System.out.println("Map: " + map.mapAll());
    }
}
