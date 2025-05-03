package visitor.josh;

public interface Visitor {
    public void visit(IntArray array);
    public void visit(IntLinkedList list);
    public void visit(IntMap map);
}
