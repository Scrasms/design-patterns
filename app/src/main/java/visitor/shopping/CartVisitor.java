package visitor.shopping;

public interface CartVisitor {
    public void visit(Boots boots);

    public void visit(Tent tent);

    public void visit(Rations rations);
}
