package adapter.linear;

// Client Interface detailing the methods the Adapter should provide
public interface Polynomial {
    public int getInnerProduct(Polynomial q);
    public int getA();
    public int getB();
    public int getC();
}
