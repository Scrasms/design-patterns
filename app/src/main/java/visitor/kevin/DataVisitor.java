package visitor.kevin;

// Visitor interface providing methods to 'visit' all the Element classes
public interface DataVisitor {
    public void visit(IntArray element);
    public void visit(IntLinkedList element);
    public void visit(IntMap element);
}
