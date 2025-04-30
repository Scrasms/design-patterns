package composite.calculator;

// Generic Component interface, encompassing both Leaf and Composite nodes
public interface CalculatorNode {
    public double evaluate();
    public String print();
}
