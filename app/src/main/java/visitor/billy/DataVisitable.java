package visitor.billy;

// Element interface declaring a method to 'accept' Visitor classes
public interface DataVisitable {
    public void accept(DataVisitor visitor);
}
