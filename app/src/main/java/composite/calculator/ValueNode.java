package composite.calculator;

// Leaf Component Class
public class ValueNode implements CalculatorNode {
    private double val;

    public ValueNode(double val) {
        this.val = val;
    }

    @Override
    public double evaluate() {
        return val;
    }

    @Override
    public String print() {
        return Double.toString(val);
    }
}
